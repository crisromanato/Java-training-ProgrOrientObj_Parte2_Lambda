package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case5_ExpLambdaDeclarada.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case5_ExpLambdaDeclarada.entitites.ProductPred5;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

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


Predicate(exemplo com removeIf)

Predicate
https://docs.oracle.com/javase/10/docs/api/java/util/function/Predicate.html

public interface Predicate<T> {
boolean test (T t);
}

Problema exemplo
Fazer um programa que, a partir de uma lista de produtos, remova da
lista somente aqueles cujo preço mínimo seja 100.


https://github.com/acenelio/lambda2-java


 */
public class ProgrPredicate5 {
    public static void main (String[] args) {

        System.out.println ("Predicate com Expressao Lambda Declarada");
        Locale.setDefault (Locale.US);
       List<ProductPred5> list = new ArrayList<> ();

    list.add (new ProductPred5 ("Tv", 900.00));
    list.add (new ProductPred5 ("Mouse", 50.00));
    list.add (new ProductPred5 ("Tablet", 350.50));
    list.add (new ProductPred5 ("HD Case", 80.90));
    /*
    vamos criar uma variavel do tipo ProductPred5, entao colocamos
    Predicate com o tipo ProductPred5, vamos dar o nome da variavel
    de pred5 e vamos falar que o predicado vai receber uma expressão
    lambda:
    Uma funcao anonima que recebe como argumento um produto p e vai
    resultar no booleando que vai ser p.getPrice () >= 100.0

    vamos passar a variavel pred5 no list.removeIf

    Posso inclusive passar uma variavel definida.

     */

        double min = 100.0;

       // Predicate<ProductPred5> pred5 = p -> p.getPrice () >= 100.0;

        Predicate<ProductPred5> pred5 = p -> p.getPrice () >= min;

		list.removeIf (pred5);
/*
para cada produto p na minha list list quero imprimir o produto p
na tela.
 */
		for (
    ProductPred5 p : list) {
        System.out.println(p);
    }
}
}
