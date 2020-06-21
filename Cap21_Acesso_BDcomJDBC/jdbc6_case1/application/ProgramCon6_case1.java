package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc6_case1.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc3_case2.db.DB;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc6_case1.db.DbException;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc6_case1.db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

No exemplo abaixo o programa só vai fazer os ajustes pro primeiro dept
o segundo é interrompido.

para testar de novo, mude os valores e ser atualizados no dept 1
 */

public class ProgramCon6_case1 {
    public static void main (String[] args) {
/*
variavel externa
 */
        Connection conn = null;

        Statement st = null;

        try {

            conn = DB.getConnection();

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET " +
                                         "BaseSalary = 2090 WHERE " +
                                         "DepartmentId = 1");


/*
exemplo com erro no meio da execucao.
 */
            int x = 1;

            if (x < 2) {

            	throw new SQLException("Fake error");

            }


            int rows2 = st.executeUpdate("UPDATE seller SET " +
                                         "BaseSalary = 3090 WHERE " +
                                         "DepartmentId = 2");



            System.out.println("rows1 = " + rows1);

            System.out.println("rows2 = " + rows2);

        }

        catch (SQLException e) {

          e.printStackTrace ();

            }


        finally {

            DB.closeStatement(st);

            DB.closeConnection();

        }

    }

}