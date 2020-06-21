package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc3_case1.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc3_case1.db.DB;

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
 Inserção com recuperação de Id

 */

public class ProgramCon3_case1 {
    public static void main (String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
/*
variaveis externas sql
 */
        Connection conn = null;

        PreparedStatement st = null;
// conectar com o banco
        try {

            conn = DB.getConnection();



            // EXAMPLE 1:
            /*
            comando sql pra inserir dados
             */

            st = conn.prepareStatement(

                    "INSERT INTO seller " // insert into 'table'
                    //nota: id nao vai ser inserido pois é incrementado automaticamente

                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) " // nome igual a tabela sql

                    + "VALUES "

                    + "(?, ?, ?, ?, ?)"); // cada ? equivale a um campo acima (placeholder)



            // cada ? equivale a um campo acima e uma numercao informada abaixo com os tipos

            st.setString(1, "Carl Purple");

            st.setString(2, "carl@gmail.com");

            // note que usamos o java.sql.Date e nao o java.util.Date

            st.setDate(3, new java.sql.Date(sdf.parse(
                    "22/04/1985").getTime()));

            st.setDouble(4, 3000.0);

            st.setInt(5, 4);




            int rowsAffected = st.executeUpdate();


            System.out.println("Done! Rows affected: " + rowsAffected);


        }

        catch (SQLException e) {

            e.printStackTrace();

        }

        catch ( ParseException e) {

            e.printStackTrace();

        }

        finally {

            DB.closeStatement(st);

            DB.closeConnection();

        }

    }

}