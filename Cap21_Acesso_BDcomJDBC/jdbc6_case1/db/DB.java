    package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc6_case1.db;

    import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.jdbc3_case2.db.DbException;

    import java.io.FileInputStream;
    import java.io.IOException;
    import java.sql.*;
    import java.util.Properties;

    // criar metodos estaticos para conectar e desconectar com o banco de dados

    public class DB {
        // criar um metodo para connectar ao banco de dados
        // usar o import do connection do sql, iniciar a variavel com valor nulo
        private static Connection conn = null;

    // criar a conexao
        public static Connection getConnection() {

            if (conn == null) {

                try {
    //obter as propriedades para conexao
                    Properties props = loadProperties ();
    // pegar a url definida no arquivo properties - dburl.
                    String url = props.getProperty("dburl");
    // passar a url + propriedades de conexao no caso props.
                    conn = DriverManager.getConnection (url, props);
                    // conectar ao banco de dados é instanciar um obj do tipo connection

                }
    /* tratar a excecao
    nota: o sql exception é derivado da classe exception, vc é obrigado a tratar a excecao
    a nossa classe Dbexception é derivada da classe runtime exception e com isso o
     programa nao precisa colocar try catch em tudo, ela ja trata a excecao.
     Assim temos nossa excecao personalizada e nao precisa colocar toda hora um try catch

     */
                catch ( SQLException e) {

                    throw new DbException (e.getMessage ());

                }

            }

            return conn;

        }


        // fechar a conexao
        public static void closeConnection() {

            if (conn != null) {

                try {

                    conn.close();

                } catch (SQLException e) {

                    throw new DbException (e.getMessage ());

                }

            }

        }

        // criar um metodo auxiliar para carregar as propriedades de conexao
        // e guarda-los dentro de um obj especifico.
    // abrir o arquivo .properties ler os dados e guardar num objeto eg. props
        private static Properties loadProperties() {
    // instanciar a variavel usando o nome do arquivo.
            try ( FileInputStream fs = new FileInputStream(
                    "C:\\Users\\Usuario\\Desktop\\Programação\\Udemy - Nelio\\" +
                    "workplace-udemy-Nelio\\src\\ProgramacaoOrientadaObjetos_Parte2_Lambda\\" +
                    "Cap21_Acesso_BDcomJDBC\\jdbc1\\db\\db.properties")) {

                Properties props = new Properties();

                props.load(fs);

                return props;

            }

            catch ( IOException e) {

                throw new DbException (e.getMessage ());

            }

        }
        /*
        clausula pra fazer o fechamento dos recursos externos statement e resultSet
         */
        public static void closeStatement (Statement st) {

            if (st != null) {

                try {

                    st.close();

                } catch (SQLException e) {

                    throw new DbException (e.getMessage ());

                }

            }

        }



        public static void closeResultSet (ResultSet rs) {

            if (rs != null) {

                try {

                    rs.close();

                } catch (SQLException e) {

                    throw new DbException (e.getMessage ());

                }

            }

        }

    }
