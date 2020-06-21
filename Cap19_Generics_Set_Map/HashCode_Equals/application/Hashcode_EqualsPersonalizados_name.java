package ProgramacaoOrientadaObjetos_Parte2_Lambda.HashCode_Equals.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.HashCode_Equals.entities.Client;

public class Hashcode_EqualsPersonalizados_name {
    public static void main (String[] args) {

        Client c1 = new Client ("Maria", "maria@gmail.com");
        Client c2 = new Client ("Maria", "alex@gmail.com");

        String S1 = "Test";
        String S2 = "Test";

        String S1a = new String ("Test");
        String S2a = new String ("Test");

        System.out.println ( "hashcode - name c1 : " +    c1.hashCode ());
        System.out.println ( "hashcode - name c2 : " +   c2.hashCode ());
        System.out.println ( "equals - name  c1 e c2: " +  c1.equals (c2));



        /*
        neste caso abaixo deu falso, pq ele considera alocacao de memoria
        e neste caso como temos dois obj (new client) foram alocados no Heap
        dois obj de referencia diferentes. Tem posicoes de memoria dif.

        O equals olha conteudo do objeto.
         */
        System.out.println ("igual2x name =  c1 e c2: " + (c1 == c2));
        /*
        o compilador da um tratamento especial para literais e por isso olha
        o conteudo e nao a memoria.
        Quando criamos um novo objeto usando new ele considera os dados de
        memoria heap veja o caso abaixo S1a == S2a.
         */
        System.out.println ("igual2x String = S1 e S2: " + (S1 == S2));
        System.out.println ("igual2x String = S1a e S2a: " + (S1a == S2a));
    }
}
