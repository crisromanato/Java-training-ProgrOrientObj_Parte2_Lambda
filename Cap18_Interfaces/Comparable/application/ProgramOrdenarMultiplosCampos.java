package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Comparable.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Comparable.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Multiplos valores

Outro problema
Faça um programa para ler um arquivo contendo funcionários
(nome e salário) no formato.csv,armazenando-os em uma lista.
Depois,ordenar a lista por nome e mostrar o resultado na tela.
Nota:o caminho do arquivo pode ser informado "hardcode".

Maria Brown,4300.00
Alex Green,3100.00
Bob Grey,3100.00
Anna White,3500.00
Alex Black,2450.00
Eduardo Rose,4390.00
Willian Red,2900.00
Marta Blue,6100.00
Alex Brown,5000.00

 */
public class ProgramOrdenarMultiplosCampos {

    public static void main(String[] args) {
/*
lista de funcionarios
 */
        List<Employee> list = new ArrayList<>();

        String path = "C:\\temp\\in2.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            /*
            agora o arquivo vai ser csv por causa da separacao por ','
             */
            String employeeCsv = br.readLine();

            while (employeeCsv != null) {
                /*
                criar um vetor pra capturar os dados depois da ',' e
                fazer o split.
                 */
                String[] fields = employeeCsv.split(",");
                /*
                apos criar o vetor e informar como separar, vamos add a uma
                lista tanto o nome na posicao 0 quanto o salario já convertido
                pela funcao parseDouble (instanciamos o funcionario)
                 */
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                /*
                ler a proxima linha do arquivo
                 */
                employeeCsv = br.readLine();
            }
            /*
            fazer a ordenacao via funcao collections.sort
            Nota só conseguimos usar o collections sort com dois valores
            fazendo o comparable no caso no arquivo employee.

             */
            Collections.sort(list);

            /*
            usar um laco for each para imprimir os dados
             */
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage()); }
    }
}


