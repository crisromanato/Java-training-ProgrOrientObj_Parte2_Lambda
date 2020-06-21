package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Stream.Case4_FixStream.application;
/*
Exercício de fixação  - Stream

Fazer um programa para ler os dados (nome, email e salário) de funcionários a
partir de um arquivo em formato.csv.
Em seguida mostrar, em ordem alfabética, o email dos funcionários cujo salário
 seja superior a um dado valor fornecido pelo usuário.
Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra'M'.

https://github.com/acenelio/lambda7-java

Input file:
Maria,maria@gmail.com,3200.00
Alex,alex@gmail.com,1900.00
Marco,marco@gmail.com,1700.00
Bob,bob@gmail.com,3500.00
Anna,anna@gmail.com,2800.00

Execution:
Enter full file path: c:\temp\in.txt
Enter salary: 2000.00
Email of people whose salary is more than 2000.00:
anna@gmail.com bob@gmail.com
maria@gmail.com
Sum of salary of people whose name starts with 'M': 4900.00


 */
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Stream.Case4_FixStream.entities.EmployeeStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ProgramFixStream {
    public static void main (String[] args) {
        Locale.setDefault (Locale.US);

        Scanner sc = new Scanner(System.in);



        System.out.print("Enter full file path: " +
                         "\nc:\\temp\\in8.txt\n");

        String path = sc.nextLine();

// ler o arquivo

        try ( BufferedReader br = new BufferedReader(new FileReader (path))) {

// armazenar numa lista

            List<EmployeeStream> list = new ArrayList<> ();



            String line = br.readLine();

            while (line != null) {
// separar campos num vetor
                String[] fields = line.split(",");
// armazenar cada campo em uma lista
                list.add(new EmployeeStream (fields[0], fields[1],
                                             Double.parseDouble(fields[2])));

                line = br.readLine();

            }

// informar o valor de salario a ser avaliado

            System.out.print("Enter salary: ");

            double salary = sc.nextDouble();


// stream de salario baseado nos emails.
            List<String> emails = list.stream()

                                      .filter(x -> x.getSalary() > salary)

                                      .map(x -> x.getEmail())

                                      .sorted()

                                      .collect (Collectors.toList ());



            System.out.println("\nEmail of people whose salary is more than "
                               + String.format("%.2f", salary) + ":");

            emails.forEach(System.out::println);

// stream para listar os salarios q comecam com uma letra

            double sum = list.stream()

                             .filter(x -> x.getName().charAt(0) == 'M')

                             .map(x -> x.getSalary())

                             .reduce(0.0, (x, y) -> x + y);

            System.out.println ();
            System.out.println("Sum of salary from people whose name starts " +
                               "with 'M': " + String.format("%.2f", sum));



        } catch ( IOException e) {

            System.out.println("Error: " + e.getMessage());

        }

        sc.close();

    }
    }

