package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc6_case3.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc3_case2.db.DB;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc6_case3.db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
/*
Demo: transações

Referências: https://www.ibm.com/support/knowledgecenter/en/SSGMCP_5.4.0/product-overview/acid.html

Código fonte: https://github.com/acenelio/jdbc6

API:
 setAutoCommit(false) - se for verdadeiro é confirmada automaticamentte se
estiver verdadeiro.
 commit()
 rollback()

 ACID properties of transactions - aprende-se em banco de dados
 Atomicity - ou acontece tudo ou nao acontece nada
 Consistency
 Isolation
 Durability

 eg. transf. bancaria, se a cadeia inteira do processo nao ocorre o
 processo é estornado.

teste com protecao e funcionando corretamente

 */

public class ProgramCon6_case3 {
    public static void main (String[] args) {
/*
variavel externa
 */
        Connection conn = null;

        Statement st = null;

        try {

            conn = DB.getConnection();



            conn.setAutoCommit(false);



            st = conn.createStatement();



            int rows1 = st.executeUpdate("UPDATE seller SET " +
                                         "BaseSalary = 2190 WHERE " +
                                         "DepartmentId = 1");



            //int x = 1;

            //if (x < 2) {

            //	throw new SQLException("Fake error");

            //}



            int rows2 = st.executeUpdate("UPDATE seller SET " +
                                         "BaseSalary = 3190 WHERE " +
                                         "DepartmentId = 2");



            conn.commit();



            System.out.println("rows1 = " + rows1);

            System.out.println("rows2 = " + rows2);

        }

        catch (SQLException e) {

            try {

                conn.rollback();

                throw new DbException ("Transaction rolled back! Caused by: " + e.getMessage ());

            }

            catch (SQLException e1) {

                throw new DbException ("Error trying to rollback! Caused by: " + e1.getMessage ());

            }

        }

        finally {

            DB.closeStatement(st);

            DB.closeConnection();

        }

    }

}