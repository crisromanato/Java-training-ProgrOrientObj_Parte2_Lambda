package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Case1.application;
/*
Curso Programação Orientada a Objetos com Java Capítulo:
Programação Funcional e Expressões Lambda

Uma experiência com Comparator

Problema
• Suponha uma classe Productcom os atributos namee price.

• Podemos implementar a comparação de produtos por meio da implementação
da interface Comparable<Product>

• Entretanto, desta forma nossa classe não fica fechada para alteração:
se o critério de comparação mudar, precisaremos alterar a classe Product.

• Podemos então usar o default method"sort" da interface List:
default void sort(Comparator<? super E> c)

Comparator

https://docs.oracle.com/javase/10/docs/api/java/util/Comparator.html

Veja o método sort na interface List:

https://docs.oracle.com/javase/10/docs/api/java/util/List.html

Em termos de manutencao isso [é indesejavel.

 */

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Case1.entities.ProductComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramComparator {

    public static void main (String[] args) {

        List<ProductComparator> list = new ArrayList<> ();

        list.add(new ProductComparator ("TV", 900.00));
        list.add(new ProductComparator ("Notebook", 1200.00));
        list.add(new ProductComparator ("Tablet", 450.00));

        Collections.sort(list);

        for (ProductComparator p : list) {
            System.out.println (p);
        }
    }
}
