package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc3_case2.db;

public class DbException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DbException(String msg){

        super(msg);
    }
}
