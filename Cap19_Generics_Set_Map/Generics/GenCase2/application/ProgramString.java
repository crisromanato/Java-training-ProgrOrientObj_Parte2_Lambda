package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Generics.GenCase2.application;


import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Generics.GenCase2.services.PrintService;

import java.util.Scanner;

/*

Generics
• Genericspermitem que classes, interfaces e métodos possam ser parametrizados
por tipo.
Seus benefícios são:
• Reuso
• Typesafety
• Performance


• Uso comum:
coleções

List<String> list = new ArrayList<>();
list.add("Maria");
String name = list.get(0);

Problema motivador 1 (reuso para String)

Deseja-se fazer um programa que leia uma quantidade N, e depois N
números inteiros.
Ao final, imprima esses números de forma organizada conforme exemplo.
Em seguida, informar qual foi o primeiro valor informado

How many values? 3
 10
 8
 23
 [10, 8, 23]
 First: 10

 Criar um serviço de impressão:

 Suponha que ao inves de numeros inteiros eu quero digitar nomes

 */
public class ProgramString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
             String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        String x = ps.first();
        System.out.println("First: " + x);

        //System.out.println("First: " + ps.first());
        sc.close();
    }

    }

