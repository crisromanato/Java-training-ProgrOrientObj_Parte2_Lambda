package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.FunctRecFunct.Case2_MinhaFunct.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.FunctRecFunct.Case2_MinhaFunct.entities.ProductMinhaFunction2;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.FunctRecFunct.Case2_MinhaFunct.services.ProductService2;

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
public class ProgrMinhaFunction2 {
    public static void main (String[] args) {

        Locale.setDefault (Locale.US);
       List<ProductMinhaFunction2> list = new ArrayList<> ();

        System.out.println ("funções que recebem outra função lambda como " +
                            "argumento ");
        
    list.add (new ProductMinhaFunction2 ("Tv", 900.00));
    list.add (new ProductMinhaFunction2 ("Mouse", 50.00));
    list.add (new ProductMinhaFunction2 ("Tablet", 350.50));
    list.add (new ProductMinhaFunction2 ("HD Case", 80.90));

/*
instanciar o product service

 */

        ProductService2 ps = new ProductService2 ();

/*
chamamos o ps.filteredSum passando a lista e guarda na variavel sum e
tambem o predicado p que leva a p.getName().charAt(0) == 'T');
 */
        double sumT = ps.filteredSum (list, p -> p.getName().charAt(0) == 'T');
        double sumM = ps.filteredSum (list, p -> p.getName().charAt(0) == 'M');
        double sumMenor = ps.filteredSum (list, p -> p.getPrice () < 100);
        /*
        mostra na tela a variavel sum

        agora vamos melhor essa chamada dos produtos iniciados com a letra
        t no productService
         */

        System.out.println ("Sum 'T' = " + String.format ("%.2f", sumT));
        System.out.println ("Sum 'M' = " + String.format ("%.2f", sumM));
        System.out.println ("Sum 'Menor que 100 ' = " + String.format ("%.2f", sumMenor));
}
}
