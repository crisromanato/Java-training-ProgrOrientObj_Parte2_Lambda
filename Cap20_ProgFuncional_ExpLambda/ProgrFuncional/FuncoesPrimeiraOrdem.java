package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.ProgrFuncional;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.ExpressaoLambda.Case1.entities.ProductExpLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

Paradigma funcional de programação
Baseado no formalismo matemático Cálculo Lambda (Church1930)

                              Programação Imperativa    Programação Funcional
-----------------------------------------------------------------------------
Como se descreve algo a ser
 computado (*)                      comandos
                                ("como" - imperativa)
                                                                expressões
                                                        ("o quê" -declarativa)
-----------------------------------------------------------------------------
Funções possuem transparência
 referencial (ausência de
 efeitos colaterais)                fraco                       forte
-----------------------------------------------------------------------------
 Objetos imutáveis (*)              raro                        comum
 Vantangem:
 Programa mais simples
 facil manutençao
obj imutaveis são
threads (topicos) safe
mais facil de trabalhar com
concorrência.
-----------------------------------------------------------------------------
 Funções são objetos de primeira
 ordem                              não                         sim
 
-----------------------------------------------------------------------------
 Expressividade / código conciso    baixa                       alta
 na progr imperativa ele
 costuma ser verboso e na funcional
 é conciso.
-----------------------------------------------------------------------------
 Tipagem dinâmica / inferênciade
 tipos                              raro                        comum
 eg. de inferencia de tipos
 tivemos no progr e expressao lamba
 onde p1 e p2 foram lidos por inferencia
 nao foi necessario declarar o programa
 deduziu que o tipo dos parametros eram
 product.


 eg.Tipagem dinâmica / inferência de tipos

list.sort((p1, p2) -> p1.getPrice().compareTo(
                      p2.getPrice()));

-----------------------------------------------------------------------------

O que são "expressões lambda"?
Em programação funcional, expressão lambda corresponde a uma função anônima
de primeira classe.

Não tem nome , não foi declarada e pode ser passada como argumento.
eg.
list.sort((p1, p2) -> p1.getPrice().compareTo(
                      p2.getPrice()));

Nota:

Cálculo Lambda = formalismo matemático base da programação funcional
Expressão lambda = função anônima de primeira classe
-----------------------------------------------------------------------------


Funções são objetos de primeira
 ordem

Funções são objetos de primeira ordem (ou primeira classe)

Isso significa que funções podem, por exemplo, serem passadas como
parâmetros de métodos, bem como retornadas como resultado de métodos.

 */
public class FuncoesPrimeiraOrdem {
    /*
funcao para comparar os produtos por preço
     */
    public static int compareProducts (ProductExpLambda p1,
                                       ProductExpLambda p2) {
        return p1.getPrice ().compareTo (p2.getPrice ());
    }

    public static void main (String[] args) {
        List<ProductExpLambda> list = new ArrayList<> ();
        list.add (new ProductExpLambda ("TV", 900.00));
        list.add (new ProductExpLambda ("Notebook", 1200.00));
        list.add (new ProductExpLambda ("Tablet", 450.00));
/*
Dentro da programscao funcional eg.
dentro do list.sort eu posso passar a funcao para comparacao dos produtos
como argumento de outra funcao, isso é ele é um objeto de primeira ordem
que pode ser usado como argumento ou ate ser retornado dentro de uma funcao.
Na programacao funcional isso é comum.
 */
        list.sort (FuncoesPrimeiraOrdem :: compareProducts);

        list.forEach (System.out :: println);
    }
}

