package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.TiposCuringa.Case1;

import java.util.Arrays;
import java.util.List;

/*
Com tipos curinga podemos fazer métodos que recebem um genérico
de "qualquer tipo":

Testar

 */
public class ProgramCuringa2 {
    public static void main (String[] args) {

        List<Integer> myInts = Arrays.asList (5, 2, 10);
        printList(myInts);

        List<String> myStr = Arrays.asList ("Maria", "Alex", "Bob");
        printList(myStr);
    }
    public static void printList (List<?> list) {
        /*
        o compilador nao sabe dizer se a add e string ou inteiro e
        mostra um erro.
        Entao:
        não é possível adicionar dados a uma coleção de tipo curinga
         */
        //list.add (3);
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    }

