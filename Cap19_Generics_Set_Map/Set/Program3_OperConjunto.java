package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
/*

Alguns métodos importantes
    • add(obj), remove(obj), contains(obj) - verificar se o obj existe
        • Baseado em equals e hashCode
        • Se equals e hashCode não existir, é usada comparação de ponteiros

        • clear() • size() • removeIf(predicate)

    • addAll(other) -união: adiciona no conjunto os elementos do outro conjunto,
        sem repetição
    • retainAll(other) -interseção: remove do conjunto os elementos não contito
        sem other
    • removeAll(other) -diferença: remove do conjunto os elementos contidos em other


 */
public class Program3_OperConjunto {
    public static void main (String[] args) {

        Set<Integer> a = new TreeSet<> (Arrays.asList (0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList (5, 6, 7, 8, 9, 10));

//union
        /*
        Estou criando um set c copia do set a
        depois estou add todos b
         */
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println ("Union - adiciona no conjunto eg. 'b' os elementos do " +
                            "outro conjunto eg. 'a' , sem repetição  ");
        System.out.println ("Set a : " + a);
        System.out.println ("Set b : " + b);
        System.out.println("Set c : " + c);

        System.out.println (" ---------------------------- ");

//intersection
         /*
        Estou criando um set d copia do set a
        depois estou retainAll b - é o mesmo de reter somente os itens do a
        contidos em b
         */
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println ("Intersection -  remove do conjunto eg 'a' os elementos " +
                            "não contidos eg. 'b', sem other ");
        System.out.println ("Set a : " + a);
        System.out.println ("Set b : " + b);
        System.out.println("Set d : " + d);

        System.out.println (" ---------------------------- ");

//difference
         /*
        Estou criando um set e copia do set a
        depois estou removendo todos b
         */
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println ("difference -  remove do conjunto eg. 'a' os elementos " +
                            "contidos eg. 'b' em other");
        System.out.println ("Set a : " + a);
        System.out.println ("Set b : " + b);
        System.out.println("Set e : " + e);
    }

}

