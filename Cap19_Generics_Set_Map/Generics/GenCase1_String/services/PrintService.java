package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Generics.GenCase1_String.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
/*
tem internamente uma lista de numeros inteiros
ja usando generic
 */
    private List<String > list = new ArrayList<>();
/*
addValue recebe um valor inteiro e add na lista
 */
    public void addValue(String value) {
                list.add(value);
    }
/*
operacao firs q devolve o primeiro elemento armazenado no printservice
com programacao defensiva, verificando se a lista esta vazia do contrario
retorna o primeiro elemento da lista.
 */
    public String first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }
/*
logica para impressao
 */
    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            /*
se a lista nao estiver vazia vai imprimir por fora o primeiro elemento
             */
            System.out.print(list.get(0));
        }
        /*
        do segundo elemento em diante vai imprimir o elemento e uma ','
         */
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        /*
        no final fecha colchetes.
         */
        System.out.println("]");
    }
}
