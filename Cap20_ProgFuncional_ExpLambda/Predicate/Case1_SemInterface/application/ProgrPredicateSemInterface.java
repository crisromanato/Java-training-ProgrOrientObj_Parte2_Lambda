package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case1_SemInterface.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case1_SemInterface.entities.ProductPred1semInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
public class ProgrPredicateSemInterface {
    public static void main (String[] args) {

        Locale.setDefault (Locale.US);
       List<ProductPred1semInterface> list = new ArrayList<> ();

    list.add (new ProductPred1semInterface ("Tv", 900.00));
    list.add (new ProductPred1semInterface ("Mouse", 50.00));
    list.add (new ProductPred1semInterface ("Tablet", 350.50));
    list.add (new ProductPred1semInterface ("HD Case", 80.90));


/*
removeIf + predicate na forma de expressao lambda
p -> p.getPrice() >= min
todo produto p tal que p.getPrice() seja maior ou igual a 100

 */
		list.removeIf(p -> p.getPrice() >= 100);
/*
para cada produto p na minha list list quero imprimir o produto p
na tela.
 */
		for (
    ProductPred1semInterface p : list) {
        System.out.println(p);
    }
}
}
