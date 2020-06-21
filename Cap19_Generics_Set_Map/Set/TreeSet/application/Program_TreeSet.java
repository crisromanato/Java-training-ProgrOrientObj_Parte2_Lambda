package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Set.TreeSet.application;


import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Set.CaseTestIgualdade.Case2_ComHashcodeEquals.entities.Product5_TestIgualdade;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Set.TreeSet.entities.ProductTreeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Como TreeSetcompara os elementos?

Recordando as implementações
• Principais implementações:
• HashSet-mais rápido (operações O(1) em tabela hash) e não ordenado
• TreeSet-mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado
pelo compareTodo objeto (ou Comparator)
• LinkedHashSet-velocidade intermediária e elementos na ordem em que são
adicionados


 */
public class Program_TreeSet {
    public static void main (String[] args) {
/*
criei um set de product e add 3 produtos
Se rodarmos sem inclusao do comparable gerara o erro:

Exception in thread "main" java.lang.ClassCastException: class
xxx TreeSet cannot be cast to class java.lang.Comparable

Sendo assim temos q implementar a classe comparable no product.

 */
        Set<ProductTreeSet> set = new TreeSet<> ();
        set.add(new ProductTreeSet ("TV", 900.0));
        set.add(new ProductTreeSet ("Notebook", 1200.0));
        set.add(new ProductTreeSet ("Tablet", 400.0));

        for (ProductTreeSet p : set) {
            System.out.println(p); }
    }
}

