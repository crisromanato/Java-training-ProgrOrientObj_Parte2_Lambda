package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.GenericDelimitado.Case1.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.GenericDelimitado.Case1.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*

Genéricos delimitados

Problema

Uma empresa de consultoria deseja avaliar a performance de produtos,
funcionários, dentre outras coisas. Um dos cálculos que ela precisa é
encontrar o maior dentre um conjunto de elementos. Fazer um programa que
 leia um conjunto de produtos a partir de um arquivo, conforme exemplo,
 e depois mostre o mais caro deles.

Criar um serviço de cálculo:
Computer,890.50
IPhone X,910.00
Tablet,550.00
Most expensive: IPhone, 910.00

https://github.com/acenelio/generics2-java

 */
public class Program {
    public static void main(String[] args) {
/*
definido lista de inteiros
 */
        List<Integer> list = new ArrayList<>();

        /*
        abrir um arquivo
         */

        String path = "C:\\temp\\in3.txt";

/*
 ler o arquivo
 */
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {


/*
guardar as linhas lidas
 */
            String line = br.readLine();
            while (line != null) {
                list.add(Integer.parseInt(line));
                line = br.readLine();
            }

            /*
            operacao responsavel por encontar o maior valor
                      */
            Integer x = CalculationService.max(list);
            System.out.println("Max:");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        }

    }
}
