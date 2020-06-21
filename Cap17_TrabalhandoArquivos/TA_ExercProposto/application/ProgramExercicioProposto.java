package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap17_TrabalhandoArquivos.TA_ExercProposto.application;


import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap17_TrabalhandoArquivos.TA_ExercProposto.entities.ProductCap17;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
Exercício proposto

1. Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos.

2. criar uma classe produto
Cada item possui um nome, preço unitário e quantidade,
separados por vírgula.

- usar a dica de split que aprendemos na aula de String
dentro do programa principal


3. Você deve gerar um novo arquivo chamado "summary.csv",
localizado em uma subpasta chamada "out" a partir da
pasta original do arquivo de origem, contendo apenas
o nome e o valor total para aquele item
(preço unitário multiplicado pela quantidade),
conforme exemplo.

Example:
Source file:
TV LED,1290.99,1
Video Game Chair,350.50,3
Iphone X,900.00,2
Samsung Galaxy 9,850.00,2

Output file (out/summary.csv):

TV LED,1290.99
Video Game Chair,1051.50
Iphone X,1800.00
Samsung Galaxy 9,1700.00


https://github.com/acenelio/files1-java

Sugestao:
Instanciar um objeto produto e para cada
produto que lermos teremos que calcular
o total do item.

O nome do arquivo e local pra armazenar deve
ser: (out/summary.csv)

 */
public class ProgramExercicioProposto {
    public static void main(String[] args) throws ParseException {


/*
configuracao basica

 */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

/*
2. lista de produto
 */

        List<ProductCap17> list = new ArrayList<>();

/*
1. adicionar o caminho a ser lido o arquivo com os dados
 */

        System.out.println("Enter file path: eg. C:\\temp\\sourcefile.txt ");
/*
1. iniciar variavel para ler o file informado acima e tratar os dados.
 */
        String sourceFileStr = sc.nextLine();
/*
1. instanciar a variavel
 */
        File sourceFile = new File(sourceFileStr);
/*
1. ler o folder dentro da variavel instanciada acima
para ser usado na criacao de um novo folder.
*/
        String sourceFolderStr = sourceFile.getParent();
        System.out.println();
        System.out.println("********* Path para novo folder: ********** " + sourceFileStr);
/*
criar um novo folder
 */
        boolean success = new File(sourceFolderStr + "\\out_ExProposto").mkdir();

        /*
inserir o arquivo no novo folder com outro nome
 */
        String targetFileStr = sourceFolderStr + "\\out_ExProposto\\summary.csv";

        System.out.println("******** Target file created: ******* "+ targetFileStr);
/*
ler o arquivo original
 */
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
/*
salvar dados dentro da variavel itemCsv
 */
            String itemCsv = br.readLine();
            while (itemCsv != null) {
/*
fazer  split da string para os campos com ',' usando um vetor.
 */
                String[] fields = itemCsv.split(",");
/*
armazenar em um vetor chamado fields e instanciar cada um com seu
formato
usado o parse para converter os valores de string para o formato correto.
 */
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
/*
add os itens a lista de produtos com todos os campos contidos na classe produto
fazendo o instanciamento
 */
                list.add(new ProductCap17(name, price, quantity));
/*
fazer a leitura dos dados da lista para o bufferedreader para fazer o stream
 */
               itemCsv = br.readLine();
            }
/*
escrever os dados armazenados na lista no arquivo target
 */
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

                for (ProductCap17 item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }
/*
mostrar a msg ao final que o file foi criado
 */
                System.out.println(targetFileStr + " CREATED!");

            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
    }

}



