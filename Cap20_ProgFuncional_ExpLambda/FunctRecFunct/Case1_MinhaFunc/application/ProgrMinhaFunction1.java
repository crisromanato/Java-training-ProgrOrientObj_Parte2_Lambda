package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.FunctRecFunct.Case1_MinhaFunc.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.FunctRecFunct.Case1_MinhaFunc.entities.ProductMinhaFunction1;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.FunctRecFunct.Case1_MinhaFunc.model.services.ProductService1;

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


Criando funções que recebem funções como argumento

Recordando
• removeIf(Predicate)
• foreach(Consumer)
• map(Function)

Problema exemplo
Fazer um programa que, a partir de uma lista de produtos,
calcule a soma dos preços somente dos produtos cujo nome começa com"T".


https://github.com/acenelio/lambda5-java


 */
public class ProgrMinhaFunction1 {
    public static void main (String[] args) {

        Locale.setDefault (Locale.US);
       List<ProductMinhaFunction1> list = new ArrayList<> ();

        System.out.println ("funções que recebem funções como argumento ");
        
    list.add (new ProductMinhaFunction1 ("Tv", 900.00));
    list.add (new ProductMinhaFunction1 ("Mouse", 50.00));
    list.add (new ProductMinhaFunction1 ("Tablet", 350.50));
    list.add (new ProductMinhaFunction1 ("HD Case", 80.90));

/*
instanciar o product service

 */

        ProductService1 ps = new ProductService1();

/*
chamamos o ps.filteredSum passando a lista e guarda na variavel sum
 */
        double sum = ps.filteredSum (list);
        /*
        mostra na tela a variavel sum

        agora vamos melhor essa chamada dos produtos iniciados com a letra
        t no productService
         */

        System.out.println ("Sum = " + String.format ("%.2f", sum));
}
}
