package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.dao_jdbc_case1.db;

public class DbException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DbException(String msg){

        super(msg);
    }
}
