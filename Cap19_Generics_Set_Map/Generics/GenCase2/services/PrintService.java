package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Generics.GenCase2.services;

import java.util.ArrayList;
import java.util.List;
/*

Generics
Convertendo o print service para uso do tipo T - generics

tipo t para o generics e ee garante:
reuso para qualquer tipo
type safety - so permite ser usado para o tipo q for instanciado.

Nota o T é uma convensao, pode-se usar a palavra que quiser.
 */
public class PrintService<T> {
/*
lista vai ser to tipo T
 */
    private List<T> list = new ArrayList<>();
/*
o mesmo para as operacoes, vamos add um valor do tipo T
 */
    public void addValue(T value) {
        list.add(value);
    }
/*
a operacao first vai retornar um elemento do tipo T
 */
    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++) {
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
