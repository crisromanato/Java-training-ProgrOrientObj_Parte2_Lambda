package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc1.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc1.db.DB;

import java.sql.Connection;

public class ProgramConnection {
    public static void main (String[] args) {

        Connection conn = DB.getConnection ();

        System.out.println ("Connection Opened");
        DB.closeConnection ();
        System.out.println ("Connection Closed");
    }

}

