package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case2_Impl_Interface.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case2_Impl_Interface.entitites.ProductPred2;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case2_Impl_Interface.util.ProductPredicate2;

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
public class ProgrPredicate2ComImplementacao {
    public static void main (String[] args) {

        System.out.println ("Predicate com Implementacao classe");
        Locale.setDefault (Locale.US);
       List<ProductPred2> list = new ArrayList<> ();

    list.add (new ProductPred2 ("Tv", 900.00));
    list.add (new ProductPred2 ("Mouse", 50.00));
    list.add (new ProductPred2 ("Tablet", 350.50));
    list.add (new ProductPred2 ("HD Case", 80.90));


/*
removeIf + predicate
p -> p.getPrice() >= min
todo produto p tal que p.getPrice() seja maior ou igual a 100

eg. sem implementacao de classe predicate:
list.removeIf(p -> p.getPrice() >= min);

eg. abaixo com instanciacao classe Productpredicate com o metodo
test

 */
		list.removeIf (new ProductPredicate2 ());
/*
para cada produto p na minha list list quero imprimir o produto p
na tela.
 */
		for (
    ProductPred2 p : list) {
        System.out.println(p);
    }
}
}
