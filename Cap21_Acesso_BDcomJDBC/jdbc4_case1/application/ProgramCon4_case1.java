package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc4_case1.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc3_case2.db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/*
Demo: atualizar dados

Código fonte: https://github.com/acenelio/jdbc4

programa pra atualizar o salario de um vendedor

 */

public class ProgramCon4_case1 {
    public static void main (String[] args) {
/*
variavel externa
 */
        Connection conn = null;

        PreparedStatement st = null;

        try {

            conn = DB.getConnection();



            st = conn.prepareStatement(

                    "UPDATE seller "
/*
acrescentar ao salario mais um valor
 */
                    + "SET BaseSalary = BaseSalary + ? "

                    + "WHERE " // restricao para evitar atualizacao do banco inteiro

                    + "(DepartmentId = ?)");

/*
atribuir valores para cada parametro
 */

            st.setDouble(1, 200.0);

            st.setInt(2, 2);



            int rowsAffected = st.executeUpdate();



            System.out.println("Done! Rows affected: " + rowsAffected);

        }

        catch (SQLException e) {

            e.printStackTrace(); // mostrar na tela

        }

        finally {

            DB.closeStatement(st);

            DB.closeConnection();

        }

    }

}