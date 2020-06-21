package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc5_case1.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc3_case2.db.DB;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc5_case1.db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
Demo: deletar dados

Código fonte: https://github.com/acenelio/jdbc5

Checklist:
 Criar DbIntegrityException
    necessario pq na delecao pode ocorrer um problema de integridade
    referencial - ou seja nao se pode apagar dado que tenha chave extrangeira
    associada, ou teremos uma falha de integridade referencial
    Para identificar esse erro vamos criar uma DbIntegrityException
 Tratar a exceção de integridade referencial


 */

public class ProgramCon5_case1 {
    public static void main (String[] args) {
/*
variavel externa
 */
        Connection conn = null;

        PreparedStatement st = null;

        try {

            conn = DB.getConnection();

            st = conn.prepareStatement(

                    "DELETE FROM department "
                    + "WHERE " // comando perigoso não pode esquecer
                    + "Id = ?");

            // apagar o dept D1 que criamos e nao tem relacao com seller
            // testar primeiro com um dept sem conexao com vendedor eg. x=6
            // com 2 vai dar a excecao
            st.setInt(1, 2);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);

        }

        catch (SQLException e) {
            /*
            primeira excecao do jdbc, deve-se desativar uma ou outra para teste
             */
           // e.printStackTrace ();

             /*
            segunda excecao personalizada.
            deve-se desativar uma ou outra para teste
             */
          throw new DbIntegrityException (e.getMessage ());

        }

        finally {

            DB.closeStatement(st);

            DB.closeConnection();

        }

    }

}