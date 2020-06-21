package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Stream.Case2Pipeline.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramPipeline {
    public static void main (String[] args) {

        List<Integer> list = Arrays.asList (3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream ().map (x -> x * 10);
        System.out.println ("Stream com operacao intermediaria map e operacao" +
                            " terminal array  ");
        System.out.println(Arrays.toString(st1.toArray()));
        System.out.println ();

        /* reduce é uma operacao terminal
        reduce pega um elemento inicial que vai ser o elemento neutro da
        operacao e  depois uma funcao q recebe dois argumentos e gera um resultado
        no caso sera a funcao de soma.
         */

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println ("Stream com operacao reduce com operacao de " +
                            " soma  e operacao" +
                            " terminal array  ");
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("Sum = " + sum);
        System.out.println ();

        /* reduce pega um elemento inicial que vai ser o elemento neutro da
        operacao e  depois uma funcao q recebe dois argumentos e gera um
        resultado no caso sera a funcao de um produtorio (conta de vezes).
        Sendo que o elemento inicial tem q ser 1.
         */

        int sum1 = list.stream().reduce(1, (x, y) -> x * y);
        System.out.println ("Stream com operacao reduce com operacao de " +
                            " multiplicacao  e operacao" +
                            " terminal array  ");
        System.out.println("Sum = " + sum1);
        System.out.println ();

        /*
        Pipeline maior (gerou a stream)
        Operacoes intermediarias:
        filtrando os numeros pares usando predicado q ira gerar uma
        nova stream contendo somente o q foi posto dentro do predicado,
        MAP - tranformar o elemento da stream multiplicando por 10, gerando
        também uma nova stream e aplicar uma operacao terminar pra transformar
        a stream resultante numa lista. usando o collect
         */

        List<Integer> newList = list.stream()
                                    .filter(x -> x % 2 == 0)
                                    .map(x -> x * 10)
                                    .collect (Collectors.toList ());
        System.out.println ("Stream com operacao filter, map e collector" +
                            " e operacao" +
                            " terminal array  ");
        System.out.println(Arrays.toString(newList.toArray()));

    }
}
