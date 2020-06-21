package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.ExpressaoLambda.Case1.application;
/*
processo usando expressao Lambda

Resumo da aula
• Comparatorobjeto de classe separada
• Comparatorobjeto de classe anônima
• Comparatorobjeto de expressão lambda com chaves
• Comparatorobjeto de expressão lambda sem chaves
• Comparatorexpressão lambda "direto no argumento"
https://github.com/acenelio/lambda1-java


 */



import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.ExpressaoLambda.Case1.entities.ProductExpLambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgramExpressaoLambda2 {

    public static void main (String[] args) {

        List<ProductExpLambda> list = new ArrayList<> ();

        list.add (new ProductExpLambda ("TV", 900.00));
        list.add(new ProductExpLambda ("Notebook", 1200.00));
        list.add(new ProductExpLambda ("Tablet", 450.00));
/*
processo usando expressao Lambda

Trocar a declaracao por uma expressao lamba ou funcao anonima
a sintase da expressao, primeiro colocamos os parametros: p1, p2
O compilador faz a inferencia de tipos nao sendo necessario colocar nos
parametros: Product p1, Product p2.
depois temos a seta: ->
e depois a implementacao da funcao comp: return p1.getName ().toUpperCase ().
compareTo (p2.getName ().toUpperCase ());

                    também chamado de arrow function.

 */

        /*
        outra versao mais limpa ainda é tirando as chaves e o return.
        o compilador entende também.
         */

        Comparator<ProductExpLambda> comp = (p1, p2) -> p1.getName ().
                toUpperCase ().compareTo (p2.getName ().toUpperCase ());
        list.sort (comp );

        System.out.println ("Usando expressao Lambda ou funcao anonima");

        for (ProductExpLambda p : list) {

            System.out.println (p);
        }
    }
}
