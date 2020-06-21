package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Funcoes.Case1_Impl_Interface.util;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Funcoes.Case1_Impl_Interface.entities.ProductFunction1;

import java.util.function.Consumer;
import java.util.function.Function;

/*
Como quero transformar objeto produto em nome de produto caixa alta
entao o tipo de entrada vai ser produto e o tipo de saida vai ser string

 */
public class UpperCaseName1 implements Function<ProductFunction1, String> {

     /*
    implementacao do contrato recebendo o ProductConsumer1 chamado de p1.

    O accept do produt consumer é aumentar o preco do produto em 10%

    Esse é o consumer
     */

    @Override
    public String apply (ProductFunction1 p1) {

        return p1.getName ().toUpperCase ();
    }


    }

