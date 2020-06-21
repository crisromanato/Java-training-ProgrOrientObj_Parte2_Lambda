package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Comparable.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*

Interface Comparable

Interface Comparable
https://docs.oracle.com/javase/10/docs/api/java/lang/Comparable.html

implementacao dela:

public interface Comparable<T> { int compareTo (T o); }

o T sera explicado em generics, mas para o momento entenda como se fosse
uma lista com o tipo entre menor e maior.

o objeto 'int compareTo' vai receber um objeto o do tipo T.

Problema:

Problema motivador
Faça um programa para ler um arquivo contendo nomes de pessoas
(um nome por linha), armazenando-os em uma lista.
Depois, ordenar os dados dessa lista e mostra-los ordenadamente na tela.
Nota: o caminho do arquivo pode ser informado "hardcode".

Maria Brown
Alex Green
Bob Grey
Anna White
Alex Black
Eduardo Rose
Willian Red
Marta Blue
Alex Brown



 */
public class ProgramOrdenarComString {
    public static void main(String[] args) {
/*
instanciando lista de string
 */
        List<String> list = new ArrayList<>();

        /*
        definir o caminho do arquivo
         */

        String path = "C:\\temp\\in1.txt";
        /*
        ler o arquivo com o bufferedReader dentro de um bloco try with
        resources e add na lista
         */

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String name = br.readLine();
            while (name != null) {
                list.add(name);
                name = br.readLine();
            }
            /*
            ordenar uma colecao
             */
            Collections.sort(list);
            /*
            percorrer a lista usando o for each e imprimindo
            cada um dos elementos.
             */

            for (String s : list) {
                System.out.println(s);
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage()); }
    }
    }

