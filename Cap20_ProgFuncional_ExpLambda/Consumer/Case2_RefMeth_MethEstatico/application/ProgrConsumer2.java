package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Consumer.Case2_RefMeth_MethEstatico.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Consumer.Case2_RefMeth_MethEstatico.entities.ProductConsumer2;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Consumer.Case2_RefMeth_MethEstatico.util.PriceUpdateConsumer2;

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


Consumer(exemplo com forEach)
Consumer
https://docs.oracle.com/javase/10/docs/api/java/util/function/Consumer.html

public interface Consumer<T> {
void accept (T t); - recebe um objeto do tipo t e é um void ele
executa uma acao e nao retorna nada
}

Problema exemplo
Fazer um programa que, a partir de uma lista de produtos, aumente o
preço dos produtos em 10%.


https://github.com/acenelio/lambda3-java



 */
public class ProgrConsumer2 {
    public static void main (String[] args) {

        Locale.setDefault (Locale.US);
       List<ProductConsumer2> list = new ArrayList<> ();

        System.out.println ("Consumer usando Method static da classe produto ");
        
    list.add (new ProductConsumer2 ("Tv", 900.00));
    list.add (new ProductConsumer2 ("Mouse", 50.00));
    list.add (new ProductConsumer2 ("Tablet", 350.50));
    list.add (new ProductConsumer2 ("HD Case", 80.90));

/*
como faço para percorrer a lista e aumentar o preco d produto em 10%

fazemos um metodo default na interface lista chamado for each que recebe um
consumer como argumento.
Ele vai percorrer a colecao e executar um consumer nesta colecao para cada
elemento.

O consumer tem o metodo accept, entao vamos criar uma classe pra implementar
este metodo.

Vamos instanciar a classe PriceUpdateConsumer1 no list.forecah para que
ele precorra a lista e atualize os precos de cada produto da lista.
 */


list.forEach (ProductConsumer2 :: staticPriceUpdate);

/*
imprimir a lista usando o for.each também.
passando um consumer para imprimir a lista.
System.out :: println - estamos usando um reference method para o println

 */

list.forEach (System.out :: println);
}
}
