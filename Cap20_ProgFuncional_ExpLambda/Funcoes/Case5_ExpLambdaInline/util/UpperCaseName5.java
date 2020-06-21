package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Funcoes.Case5_ExpLambdaInline.util;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Funcoes.Case5_ExpLambdaInline.entities.ProductFunction5;

import java.util.function.Function;

/*
Como quero transformar objeto produto em nome de produto caixa alta
entao o tipo de entrada vai ser produto e o tipo de saida vai ser string

 */
public class UpperCaseName5 implements Function<ProductFunction5, String> {

     /*
    implementacao do contrato recebendo o ProductConsumer1 chamado de p1.

    O accept do produt consumer é aumentar o preco do produto em 10%

    Esse é o consumer
     */

    @Override
    public String apply (ProductFunction5 p2) {
        return p2.getName ().toUpperCase ();
    }


    }

