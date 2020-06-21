package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Stream.Case1Stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProgramStream {
    public static void main (String[] args) {

        // criar uma lista jogando os valores definidos
        List<Integer> list = Arrays.asList (3, 4, 5, 10, 7);

        // criar uma stream a partir da lista
        Stream<Integer> st1 = list.stream ();

        /* imprimir a stream, chamando a operacao toArray que converte a
        stream em um vetor         */
        System.out.println ("Impressao de stream usando toArray");
        System.out.println(Arrays.toString(st1.toArray()));
        System.out.println ();

        /* criar uma stream a partir da lista e usar um map - aplica
        uma funcao a cada elemento da minha stream.
        vamos aplicar no map a funcao que pega o elemento e faz x 10.
        */
        Stream<Integer> st1map = list.stream ().map (x -> x * 10);

        /* imprimir a stream, chamando a operacao toArray que converte a
        stream em um vetor         */
        System.out.println ("Impressao de stream usando (colecao - lista) " +
                            "map (converte valores da stream) " +
                            "e toArray para impressao");
        System.out.println(Arrays.toString(st1map.toArray()));
        System.out.println ();


         /* criar uma stream.of que permite colocar os elementos
         direto entre parentes. */
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println ("Impressao de stream.of (valor direto na " +
                            "stream) e toArray para impressao");
        System.out.println(Arrays.toString(st2.toArray()));
        System.out.println ();

        /* funcao Stream.iterate informo o primeiro valor e depois
        indico a funcao de iteracao que leva a outros valores na
        stream x -> x + 2, veja que ela é potenciamente infinita
        entao vamos usar na impressao a funcao short circuit (limit)
        para imprimir somente alguns itens.
         */
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println ("Impressao de stream.iterate (valor inicial com" +
                            "funcao para iterar novos itens) + funcao limit\n" +
                            "(para delimitar total de itens)" +
                            " e toArray para impressao");
        System.out.println(Arrays.toString(st3.limit(10).toArray()));
        System.out.println ();

        /* para a sequencia de Fibonatti vamos usar o tipo long
        Vamos gerar uma stream infinita pra sequencia
        Para gerar o par que queremos comparar vamos fazer um array de
        long dentro da Stream.iterate - Stream.iterate(new long[]{ 0L, 1L },
        esse vai ser o primeiro elemento da stream.

        vamos chamar um predicado do objeto p que leva a um novo array de
        long contendo dois elementos sendo o primeiro elemento do array
        anterior contendo o elemento anterior na posicao 1  - p[1]
        o segundo elemento sera p[0]+p[1] - que é o elemento anterior na
        posicao 0 + o elemento anterior na posicao 1.
        p->new long[]{ p[1], p[0]+p[1] })

        essa parte gera uma stream de pares:
        Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1],p[0]+p[1] }
         Como que uma stream de long temos que aplicar o map. que pode
         converter o par em um elemento.
         Para cada parzinho de elemento p - vamos pegar o p na posicao 0.
          .map(p -> p[0]);

         */
        Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L },
                                          p->new long[]{ p[1],
                                                         p[0]+p[1] })
                                                        .map(p -> p[0]);
        System.out.println ("Impressao de stream.iterate (valor inicial com" +
                            "funcao para iterar novos itens) + funcao limit\n" +
                            "(para delimitar total de itens)" +
                            " e toArray para impressao - sequencia de Fibonatti");
        System.out.println(Arrays.toString(st4.limit(20).toArray()));

    }
}
