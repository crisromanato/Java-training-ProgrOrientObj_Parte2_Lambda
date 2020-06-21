package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.ProgrFuncional;

import java.util.Arrays;

/*

Paradigma funcional de programação
Baseado no formalismo matemático Cálculo Lambda (Church1930)

                              Programação Imperativa    Programação Funcional
-----------------------------------------------------------------------------
Como se descreve algo a ser
 computado (*)                      comandos
                                ("como" - imperativa)
                                                                expressões
                                                        ("o quê" -declarativa)
-----------------------------------------------------------------------------
Funções possuem transparência
 referencial (ausência de
 efeitos colaterais)                fraco                       forte
-----------------------------------------------------------------------------
 Objetos imutáveis (*)              raro                        comum
 Vantangem:
 Programa mais simples
 facil manutençao
obj imutaveis são
threads (topicos) safe
mais facil de trabalhar com
concorrência.
-----------------------------------------------------------------------------
 Funções são objetos de primeira
 ordem                              não                         sim

-----------------------------------------------------------------------------
 Expressividade / código conciso    baixa                       alta
-----------------------------------------------------------------------------
 Tipagem dinâmica / inferênciade
 tipos                              raro                        comum
-----------------------------------------------------------------------------

Transparência referencial

Uma função possui transparência referencial se seu resultado for sempre o
mesmo para os mesmos dados de entrada.
Benefícios: simplicidade e previsibilidade.

Se uma funcao produz o mesmo resultado voce consegue prever o que ela vai
fazer. Se a funcao acessa dados externos ja nao se tem esse controle.
Fica mais complicado de dar manutencao.
eg. no codigo

 */
public class TransparenciaReferencial {
/*
atributo estatico que recebe 3
 */
        public static int globalValue = 3;
/*
programa para criar um vetor com 3 valores
 */
        public static void main(String[] args) {
            int[] vect = new int[] {3, 4, 5};
            /*
            a funcao changeOddValues muda os valores impares e eu passo
            o meu vetor.
             */
            changeOddValues(vect);
            /*
            impressao na tela do vetor
            imprimiu [6, 4, 8]
             */
            System.out.println (Arrays.toString (vect));
        }
        public static void changeOddValues(int[] numbers) {
            /*
            a funcao changeOddValues - pega o vetor e testa se o vetor
            na posicao i 'mod 2for dif. de 0' onde a sintaxe é: % 2 != 0
            ele acrescenta um i (elemento) ao valor global.

            ou seja, estou testnado se o numero é impar, pq o ' % 2 != 0'
            resto da divisao por 2 diferente de 0 é sempre impar.
            Se ele for impar vamos acrescentar neste valor o global value.

            Os valores do vetor eram 3,4 e 5. Os impares 3 e 5
            Foram acrescentados aos imapres o global value 3.
            Assim temos o resultado de: [6, 4, 8]

            A funcao changeOddValues esta acrescentando 3 unidades ao
            global value, mas o resultado nao sera o mesmp se o valor
            for diferente.
            Ou seja é um caso de não tem transparencia referencial.
            Sendo mais dificil de entender que uma funcao que depende
             exclusivamente do valor dela.


            O comportamento da funcao nao dependende da propria funcao
            mas de um valor externo.

             */
            for (int i=0; i<numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    numbers[i] += globalValue; } } }


    }

