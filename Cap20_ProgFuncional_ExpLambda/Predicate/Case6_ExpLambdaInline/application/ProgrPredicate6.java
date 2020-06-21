package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case6_ExpLambdaInline.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case6_ExpLambdaInline.entitites.ProductPred6;

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
public class ProgrPredicate6 {
    public static void main (String[] args) {

        System.out.println ("Predicate com Expressao Lambda inline");
        Locale.setDefault (Locale.US);
       List<ProductPred6> list = new ArrayList<> ();

    list.add (new ProductPred6 ("Tv", 900.00));
    list.add (new ProductPred6 ("Mouse", 50.00));
    list.add (new ProductPred6 ("Tablet", 350.50));
    list.add (new ProductPred6 ("HD Case", 80.90));
    /*
    vamos vamos passar a expressão lambda direto no list.removeIf
    Uma funcao anonima que recebe como argumento um produto p e vai
    resultar no booleando que vai ser p.getPrice () >= 100.0


     */

        double min = 100.0;

       	list.removeIf (p -> p.getPrice () >= min);
/*
para cada produto p na minha list list quero imprimir o produto p
na tela.
 */
		for (
    ProductPred6 p : list) {
        System.out.println(p);
    }
}
}
