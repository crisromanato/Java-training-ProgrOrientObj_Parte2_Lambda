package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Funcoes.Case4_ExpLambdaDeclarada.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Funcoes.Case4_ExpLambdaDeclarada.entities.ProductFunction4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
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
public class ProgrFunction4 {
    public static void main (String[] args) {

        Locale.setDefault (Locale.US);
       List<ProductFunction4> list = new ArrayList<> ();

        System.out.println ("Consumer usando expressao lambda declarada ");
        
    list.add (new ProductFunction4 ("Tv", 900.00));
    list.add (new ProductFunction4 ("Mouse", 50.00));
    list.add (new ProductFunction4 ("Tablet", 350.50));
    list.add (new ProductFunction4 ("HD Case", 80.90));

/*
converter a lista em stream e aplicar a funcao map.
a funcao map aplica uma funcao a cada elemento da stream gerando
uma nova stream com os elementos transformados.

O map recebe como argumento uma expressao lambda, entao vamos ter que pegar
o que esta sendo recebido e o que retorna dentro do implement UppercaseName eg.
ProductFunction4, String. e vamos declacar essa funcao antes.
Para ler é: declarar a funcao ProductFunction4, String chamada func que
recebe p e responde -> p.getName ().toUpperCase ();

Function<ProductFunction4, String> func =
                p -> p.getName ().toUpperCase ();

Na funcao map colocamos o nome da nossa declaracao.


a funcao map pega cada linha da colecao e aplica a funcao que estiver nela
entre parentes - no caso mudar para UpperCase.

depois temos que converter a stream para lista .collect (Collectors.toList

tudo isso tem que ser atribuido para uma nova lista que vai ser uma lista de
streams : List<String> names


 */

        Function<ProductFunction4, String> func =
                p -> p.getName ().toUpperCase ();

List<String> names = list.stream().map
        (func).collect (
                Collectors.toList ());

/*
imprimir a lista usando o for.each também.
passando a lista criada 'names'
System.out :: println - estamos usando um reference method para o println

 */

names.forEach (System.out :: println);
}
}
