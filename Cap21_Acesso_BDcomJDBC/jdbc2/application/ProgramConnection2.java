package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc2.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc2.db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
Código fonte: https://github.com/acenelio/jdbc2

API do jdbc: classes
 Statement - serve para montar o comando sql para ser executado, no caso
para recuperar os dados do banco de dados.
 ResultSet - vai representar um obj contendo o resultado da consulta em
forma de tabela.
- funcao para posicionar
    o first()       [move para posição 1, se houver]
    o beforeFirst() [move para posição 0]
    o next()        [move para o próximo, retorna false se já estiver no último]
    o absolute(int) [move para a posição dada, lembrando que dados reais
    começam em 1]

 Checklist:
  Usar o script SQL para criar a base de dados "coursejdbc"
  Fazer um pequeno programa para recuperar os departamentos
  Na classe DB, criar métodos auxiliares estáticos para fechar
 ResultSet e Statement

Atenção: o objeto ResultSet contém os dados armazenados na forma de tabela:

 */

public class ProgramConnection2 {
    public static void main (String[] args) {

        // criar variaveis para recursos externos do sql
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        /*
        vamos fazer uma conexao no banco,
        preparar uma consulta sql com o statement
        e armazenar no resultSet
         */
        try {
            conn = DB.getConnection();
            st = conn.createStatement(); // intanciado obj do tipo statement
            /*
            consulta no banco de dados onde rs rebece o st.executeQuery
             */
            rs = st.executeQuery("select * from department");

            while (rs.next()) { // funcao next vai funcionar enquanto existir um proximo)

                /*
                para cada get uso o formato que ele tem, ex. Int, String, etc.
                 */
                System.out.println(rs.getInt("Id") + "," +
                                   " " + rs.getString("Name"));

            }

        }

        catch ( SQLException e) {

            e.printStackTrace();

        }

/* clausula finally pra fechar os recursos externos que usamos.
cada uma destas clausulas podem lançar uma excecao e para nao precisarmos fazer
try catch para cada um deles, vamos na classe DB.java e vamos acrescentar a excecao la

 */

        finally {

            DB.closeResultSet(rs);

            DB.closeStatement(st);

            DB.closeConnection();

        }

    }

}
