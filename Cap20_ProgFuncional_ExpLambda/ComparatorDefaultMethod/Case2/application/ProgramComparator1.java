package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.ComparatorDefaultMethod.Case2.application;
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


import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.ComparatorDefaultMethod.Case2.entities.ProductComparator1;

import java.util.ArrayList;

import java.util.List;

public class ProgramComparator1 {

    public static void main (String[] args) {

        List<ProductComparator1> list = new ArrayList<> ();

        list.add (new ProductComparator1 ("TV", 900.00));
        list.add(new ProductComparator1 ("Notebook", 1200.00));
        list.add(new ProductComparator1 ("Tablet", 450.00));
/*
comparator é uma interface funcional
q tem apenas um metodo sendo default ou statico.

Implementar o comparator similar ao comparable.
Parameters: o -the object to be compared.
Returns: a negative integer, zero, or a positive integer as this object
is less than, equal to, or greater than the specified object.

eg.
System.out.println("maria".compareTo("alex")); - maria é maior em rel a Alex
System.out.println("alex".compareTo("maria"));
System.out.println("maria".compareTo("maria"));

Output:
12
-12
0

Neste caso fizemos uma classe para o comparator.

Dentro do argumento do list.sort vamos instanciar a classe comparator.
 */
        list.sort(new MyComparator ());

        System.out.println ("Usando comparator");

        for (ProductComparator1 p : list) {

            System.out.println (p);
        }
    }
}
