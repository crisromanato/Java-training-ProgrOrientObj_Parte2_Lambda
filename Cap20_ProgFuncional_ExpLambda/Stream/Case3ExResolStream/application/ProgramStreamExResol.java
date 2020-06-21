package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Stream.Case3ExResolStream.application;
/*
Exercício resolvido -filter, sorted, map, reduce

Fazer um programa para ler um conjunto de produtos a partir de um arquivo em
formato.csv(suponha que exista pelo menos um produto).
Em seguida mostrar o preço médio dos produtos. Depois, mostrar os nomes,
em ordem decrescente, dos produtos que possuem preço inferior ao preço médio.


Input file:
Tv,900.00
Mouse,50.00
Tablet,350.50
HD Case,80.90
Computer,850.00
Monitor,290.00

Execution:
Enter full file path: c:\temp\in.txt
Average price: 420.23
Tablet
Mouse
Monitor
HD Case

https://github.com/acenelio/lambda6-java


 */
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Stream.Case3ExResolStream.entities.ProductStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class ProgramStreamExResol {
    public static void main (String[] args) {
        Locale.setDefault (Locale.US);

        Scanner sc = new Scanner(System.in);



        System.out.print("Enter full file path: " +
                         "\nc:\\temp\\in7.txt\n");

        String path = sc.nextLine();

        // abrir o arquivo com os dados

        try ( BufferedReader br = new BufferedReader(new FileReader (path))) {


        // ler o arquivo
            List<ProductStream> list = new ArrayList<> ();

            String line = br.readLine();

            while (line != null) {
                // fazer o split da linha pra recortar os campos

                String[] fields = line.split(",");

                // add os itens a uma lista com campos separados

                list.add(new ProductStream (fields[0], Double.parseDouble(fields[1])));

                line = br.readLine();

            }
            // processamento do arquivo lido e armazenado na lista acima.
            // mostrar o preço medio dos produtos para isso teremos
            // uma variavel media - add a uma lista de stream, vamos pegar os preços
            // somar e dividir pelo tamanho da lista
            // fizemos desta forma pois nao tem q preocupar com divisao por 0.

            double avg = list.stream()

                             .map(p -> p.getPrice())

                             .reduce(0.0, (x,y) -> x + y) / list.size();

            // impressao do preco medio.

            System.out.println("Average price: " + String.format("%.2f", avg));

            // processamento da ordenaçao

            // comparador de strings para nosso sorted de forma reversa.

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase ()
                                                    .compareTo (s2.toUpperCase ());

            // FAzendo um pipeline  - criar uma stream de names,
            // filtrar todos preços abaixo da media
            // pegar todos os nomes dos produtos filtrados acima criando uma nova stream
            // ordenar os itens da stream com um sorted + comparator reversed.
            //

            List<String> names = list.stream()

                                     .filter(p -> p.getPrice() < avg)
                                     .map(p -> p.getName())
                                     .sorted(comp.reversed()) // usa o comparator decl acima
                                     .collect (Collectors.toList ()); // trasnf stream em list


            // mostrar os itens na tela chamamos o foreach recebendo o consumer
            // System.out::println

            names.forEach(System.out::println);



        } catch ( IOException e) {

            System.out.println("Error: " + e.getMessage());

        }

        sc.close();

    }
    }

