package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Generics.GenCase1_Obj.application;


import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Generics.GenCase1_Obj.services.PrintService;

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

Problema motivador 1 (reuso)

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

 Criar um serviço de impressão:somente para string
 Tive um problema de reuso se eu quiser imprimir outro tipo

 */
public class ProgramString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
/*
instanciado um print service
 */
        PrintService ps = new PrintService();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        /*
        for normal e add no printseervice os valores
        imagine q ivessemos mais um valor add porém como String.
         */

        ps.addValue("Maria");
        /*
        ao executar o programa teremos um erro, porque o valor
        nao pode ser convertido para inteiro.
        Esse tipo de erro chamados de Type safety e performance , quando fazemos
        uma chamada do tupo objeto e a conversao nao pode ser feita.
        Ele nao resolve da melhor maneira possivel.

        eg. se quisermos usar o tipo primitivo temos q fazer o boxing e
        unboxing - causando problema de performance.
         */

        for (int i = 0; i < n; i++) {
            //Integer value = sc.nextInt();
            String value = sc.next();
            ps.addValue(value);
        }
/*
printa os valores
 */
        ps.print();
        /*
        Vamos adiicionar uma variavel do tipo integer
        Veja que somente com casting funcionaria.
         */
        Integer x = (Integer) ps.first();
        System.out.println("First: " + ps.first());

        sc.close();
    }

    }

