package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Set.ExercicioResolvido.application;

/*
Exercício resolvido (Set)

Problema exemplo
Um site de internet registra um log de acessos dos usuários.
Um registro de log consiste no nome de usuário (apenas uma palavra) e
o instante em que o usuário acessou o site no padrão ISO 8601, separados
por espaço, conforme exemplo.
Fazer um programa que leia o log de acessos a partir de um arquivo,
e daí informe quantos usuários distintos acessaram o site.

Example
input file:
amanda 2018-08-26T20:45:08Z
alex86 2018-08-26T21:49:37Z
bobbrown 2018-08-27T03:19:13Z
amanda 2018-08-27T08:11:00Z
jeniffer3 2018-08-27T09:19:24Z
alex86 2018-08-27T22:39:52Z
amanda 2018-08-28T07:42:19Z

Execution:
Enter file full path:
c:\temp\in.txt Total users: 4

https://github.com/acenelio/set1-java

Nota: como o set nao aceita repetiçoes ele vai ajudar na solucao do
problema

 */


import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Set.ExercicioResolvido.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProgExercResolvido {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println ("Enter file full path: \n eg.: c:\\temp\\in5.txt");
        String path = sc.nextLine();

        try ( BufferedReader br = new BufferedReader(new FileReader (path))) {
/*
ler o arquivo com set do tipo logEntry com o hashSet por ser rapido
e no nosso problema nao importa a ordem dos dados.
 */
            Set<LogEntry> set = new HashSet<> ();

            String line = br.readLine();
            while (line != null) {
/*
criar um vetor para separar os dados usuario e data.
 */
                String[] fields = line.split(" ");
                /*
                organizando os dados - instanciando cada campo
                 */
                String username = fields[0];
                Date   moment   = Date.from (Instant.parse (fields[1]));
/*
incluir os dados no set com um add.set
se eu tentar inserir nome repetido sera barrado pelo set.
 */
                set.add (new LogEntry (username, moment));
/*
comando para ler a proxima linha, repetindo ate a line dar nulo
 */
                line = br.readLine();
            }
            /*
            fazer um print do total de usaurios usando set.size
             */
            System.out.println("Total users: " + set.size());

        } catch ( IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
    }

