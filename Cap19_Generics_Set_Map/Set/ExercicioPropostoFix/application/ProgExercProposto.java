package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Set.ExercicioPropostoFix.application;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Exercício proposto  (Set)

Problema exemplo
Em um portal de cursos online, cada usuário possui um código único,
representado por um número inteiro.
Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno
pode se matricular em quantos cursos quiser.Assim,o número total de alunos
de um instrutor não é simplesmente a soma dos alunos de todos os cursos que
ele possui, pois pode haver alunos repetidos e mmais de um curso.
O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total
de alunos.
Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex,
depois mostrar a quantidade total e alunos dele,conforme exemplo.

https://github.com/acenelio/set2-java

Example:
How many students for course A?3
21  35  22
 How many students for course B?2
 21  50
 How many students for courseC? 3
 42  35  13
 Total students: 6


 */
public class ProgExercProposto {
    public static void main (String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<> ();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int number = sc.nextInt();
            a.add(number);
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int number = sc.nextInt();
            b.add(number);
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int number = sc.nextInt();
            c.add(number);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());

        sc.close();
    }
}
