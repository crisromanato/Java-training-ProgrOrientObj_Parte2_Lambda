package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap21_Acesso_BDcomJDBC.dao_jdbc_case1.application;

/*

Padrão de projeto DAO (Data Access Object)

Referências: https://www.devmedia.com.br/dao-pattern-persistencia-de-dados-utilizando-o-padrao-dao/30999 https://www.oracle.com/technetwork/java/dataaccessobject-138824.html

Ideia geral do padrão DAO:
 Para cada entidade, haverá um objeto responsável por fazer acesso
a dados relacionado a esta entidade. Por exemplo:
o Cliente: ClienteDao
o Produto: ProdutoDao
o Pedido: PedidoDao

 Cada DAO será definido por uma interface.
 A injeção de dependência pode ser feita por meio do padrão de
projeto Factory (quando não usa framework)
O obj factory é responsavel por instanciar os objetos do dao.

interface cliente dao               interface produto dao
incert, update, delte find, etc (para ambas interfaces)

classes que implementam as interfaces usando qualquer tecnologia, como
jdbc, csharp, etc.
clientedaojdbc                         produtodaojdbc


daoFactory (responsavel por instanciar a implementacao)
create cliente dao
create produto dao

endereço gravado o projeto.

Creating project and git repository

Project: http://github.com/acenelio/demo-dao-jdbc

Checklist:
 Github: create a new project (new repository - nome demo-dao-jdbc) + gitigonere do java
    o NOTE: choose .gitignore type as Java
 Eclipse: create new java project with MySQLConnector library
    o Copy db package and db.properties from:
        https://github.com/acenelio/jdbc5
        ir no github - download copiar o path e abrir o gitbash no c/temp
         pra clonar a pasta.
        git clone + url do git hub
        copiar a pasta do diretorio c/temp criada e colar no src do novo
        projeto dao_jdbc1_case1. e a classe db.properties colar na raiz
        do src.

 Create local repository and push to Github:
pra isso tem q ir na pasta onde o projeto esta gravado no seu pc, fora
do src. abrir o git bash.

1. git init - cria o repositorio local

2. associar o repositorio local ao repositorio do git hub.
git remote add origin https://github.com/acenelio/demo-dao-jdbc.git

3. git pull origin master - para atualizar o projeto local com os dados
do projeto no github - pra trazer o gitignore.

4. git status - para conferir se está ok.

5. fazer o primeiro commit da aula no gitbash digitar
git add .
git commit -m "Creating project and git repository"

6. git push -u origin master - pra enviar o projeto apra o git hub
usuario e senha - enviou.

Department entity class

Entity class checklist:
 Attributes
 Constructors
 Getters/Setters
 hashCode and equals
 toString
 implements Serializable


 */
public class Program_dao_jdbc1 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);



        SellerDao sellerDao = DaoFactory.createSellerDao();



        System.out.println("=== TEST 1: seller findById =====");

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);



        System.out.println("\n=== TEST 2: seller findByDepartment =====");

        Department department = new Department(2, null);

        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list) {

            System.out.println(obj);

        }



        System.out.println("\n=== TEST 3: seller findAll =====");

        list = sellerDao.findAll();

        for (Seller obj : list) {

            System.out.println(obj);

        }



        System.out.println("\n=== TEST 4: seller insert =====");

        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);

        sellerDao.insert(newSeller);

        System.out.println("Inserted! New id = " + newSeller.getId());



        System.out.println("\n=== TEST 5: seller update =====");

        seller = sellerDao.findById(1);

        seller.setName("Martha Waine");

        sellerDao.update(seller);

        System.out.println("Update completed");



        System.out.println("\n=== TEST 6: seller delete =====");

        System.out.println("Enter id for delete test: ");

        int id = sc.nextInt();

        sellerDao.deleteById(id);

        System.out.println("Delete completed");



        sc.close();

    }

}
}
