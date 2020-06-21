package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc3_case2.application;

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
 Inserção com recuperação de Id - seller

 */

public class ProgramCon3_case2 {
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



            // EXAMPLE 1:
            /*
            comando sql pra inserir dados
             */

            st = conn.prepareStatement(

                    "INSERT INTO seller " // insert into 'table'
                    //nota: id nao vai ser inserido pois é incrementado automaticamente

                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) " // nome igual a tabela sql

                    + "VALUES "

                    + "(?, ?, ?, ?, ?)", // cada ? equivale a um campo acima (placeholder)
                    //sobrecarga com parametro:
                    Statement.RETURN_GENERATED_KEYS);

            // cada ? equivale a um campo acima e uma numercao informada abaixo com os tipos

            st.setString(1, "Carl Purple");

            st.setString(2, "carl@gmail.com");

            // note que usamos o java.sql.Date e nao o java.util.Date

            st.setDate(3, new Date(sdf.parse("22/04/1985").getTime()));

            st.setDouble(4, 3000.0);

            st.setInt(5, 4);



            int rowsAffected = st.executeUpdate();

// tratamento especial if

            if (rowsAffected > 0) {
/*
pode ser recebido mais de um valor com o getGeneratedKeys
 */
                ResultSet rs = st.getGeneratedKeys();

                while (rs.next()) {
/*
rs.getInt(1) pq é uma tabela auxiliar contendo somente 1 coluna contendo os IDs
 */
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

        catch ( ParseException e) {

            e.printStackTrace();

        }

        finally {

            DB.closeStatement (st);

            DB.closeConnection ();

        }

    }

}