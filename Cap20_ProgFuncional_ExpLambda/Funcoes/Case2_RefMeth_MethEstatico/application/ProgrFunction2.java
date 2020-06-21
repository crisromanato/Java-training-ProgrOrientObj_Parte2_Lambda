package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Funcoes.Case2_RefMeth_MethEstatico.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Funcoes.Case2_RefMeth_MethEstatico.entities.ProductFunction2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/*
Interface funcional

Interface funcional É uma interface que possui um único método abstrato.
Suas implementações serão tratadas como expressões lambda.

eg:
public class MyComparator implements Comparator<Product> {
@Override
public int compare(Product p1, Product p2) {
return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()); }
}

public static void main(String[] args) {
(...)
list.sort(new MyComparator());

Algumas outras interfaces funcionais comuns
• Predicate
• https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
• Function
• https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
• Consumer
• https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html • Nota: ao contrário das outras interfaces funcionais, no caso do Consumer, é esperado ele possa gerar efeitos colaterais


Function(exemplo com map)

Function
https://docs.oracle.com/javase/10/docs/api/java/util/function/Function.html

ela tem dois parametros um tipo T e outro
tipo R
ela recebe um objeto do tipo T e retorna um objeto do tipo R

public interface Function<T, R> {
R apply (T t);
}


Problema exemplo
Fazer um programa que, a partir de uma lista de produtos, gere uma nova
lista contendo os nomes dos produtos em caixa alta.

Nota sobre a função map
• A função "map" (não confunda com a estrutura de dados Map) é uma
função que aplica uma função a todos elementos de uma stream.

Stream é uma sequencia de dados

A funcao map so funciona a partir de uma stream e nao a partir de uma lista.
Assim temos que converter a lista pra stream, aplicar o map e depois
converter a stream de volta pra lista.


• Conversões:
• Listpara stream: .stream() a partir da lista
• Stream para List: .collect(Collectors.toList()) a partir da stream.


https://github.com/acenelio/lambda4-java

 */
public class ProgrFunction2 {
    public static void main (String[] args) {

        Locale.setDefault (Locale.US);
       List<ProductFunction2> list = new ArrayList<> ();

        System.out.println ("Consumer usando static method ");
        
    list.add (new ProductFunction2 ("Tv", 900.00));
    list.add (new ProductFunction2 ("Mouse", 50.00));
    list.add (new ProductFunction2 ("Tablet", 350.50));
    list.add (new ProductFunction2 ("HD Case", 80.90));

/*
converter a lista em stream e aplicar a funcao map.
a funcao map aplica uma funcao a cada elemento da stream gerando
uma nova stream com os elementos transformados.

O map recebe como argumento um funcao, entao vamos criar uma instancia
da nossa classe UpperCaseName1
a funcao map pega cada linha da colecao e aplica a funcao que estiver nela
entre parentes - no caso mudar para UpperCase.

depois temos que converter a stream para lista .collect (Collectors.toList

tudo isso tem que ser atribuido para uma nova lista que vai ser uma lista de
streams : List<String> names

 */


List<String> names = list.stream().map
        (ProductFunction2 :: staticUpperCaseName).collect (
                Collectors.toList ());

/*
imprimir a lista usando o for.each também.
passando a lista criada 'names'
System.out :: println - estamos usando um reference method para o println

 */

names.forEach (System.out :: println);
}
}
