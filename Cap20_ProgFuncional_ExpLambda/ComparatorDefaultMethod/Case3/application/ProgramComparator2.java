package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.ComparatorDefaultMethod.Case3.application;
/*
processo usando sintaxe de classe anonima

 */


import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.ComparatorDefaultMethod.Case3.entities.ProductComparator2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgramComparator2 {

    public static void main (String[] args) {

        List<ProductComparator2> list = new ArrayList<> ();

        list.add (new ProductComparator2 ("TV", 900.00));
        list.add(new ProductComparator2 ("Notebook", 1200.00));
        list.add(new ProductComparator2 ("Tablet", 450.00));
/*
processo usando sintaxe de classe anonima
declarar uma variavel do tipo comparator (classe anonima) e iniciar a variavel
 */
        Comparator<ProductComparator2> comp = new Comparator<
                ProductComparator2> () {

            @Override
            public int compare (ProductComparator2 prod1, ProductComparator2 prod2) {
                return prod1.getName ().toUpperCase ().compareTo (prod2.getName ().toUpperCase ());
            }
        };

        list.sort (comp );

        System.out.println ("Usando comparator via classe anonima");

        for (ProductComparator2 p : list) {

            System.out.println (p);
        }
    }
}
