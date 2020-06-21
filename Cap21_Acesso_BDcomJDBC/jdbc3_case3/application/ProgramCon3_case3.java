package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc3_case3.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc3_case2.db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/*
Demo: inserir dados

Código fonte: https://github.com/acenelio/jdbc3

API: classes do sql
 PreparedStatement
    montar a consulta no sql deixando os parametros para colocar depois
 executeUpdate
 Statement.RETURN_GENERATED_KEYS
 getGeneratedKeys

Checklist:
 Inserção simples com preparedStatement
 Inserção com recuperação de Id - dept

 */

public class ProgramCon3_case3 {
    public static void main (String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
/*
variaveis externas sql
 */
        Connection conn = null;

        PreparedStatement st = null;
// conectar com o banco
        try {

            conn = DB.getConnection ();





            // EXAMPLE 2:com inserçao de dois valores

            st = conn.prepareStatement(
                    /*
                    um comando sql pra inserir dois valores.
                     */

            		"insert into department (Name) values ('D1'),('D2')",

            		Statement.RETURN_GENERATED_KEYS);



            int rowsAffected = st.executeUpdate();



            if (rowsAffected > 0) {

                ResultSet rs = st.getGeneratedKeys();

                while (rs.next()) {

                    int id = rs.getInt(1);

                    System.out.println("Done! Id: " + id);

                }

            }

            else {

                System.out.println("No rows affected!");

            }

        }

        catch (SQLException e) {

            e.printStackTrace();

        }



        finally {

            DB.closeStatement (st);

            DB.closeConnection ();

        }

    }

}