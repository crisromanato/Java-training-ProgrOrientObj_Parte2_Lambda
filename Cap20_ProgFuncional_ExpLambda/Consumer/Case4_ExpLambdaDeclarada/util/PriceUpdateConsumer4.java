package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Consumer.Case4_ExpLambdaDeclarada.util;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Consumer.Case4_ExpLambdaDeclarada.entities.ProductConsumer4;

import java.util.function.Consumer;

public class PriceUpdateConsumer4 implements Consumer <ProductConsumer4> {

    /*
    implementacao do contrato recebendo o ProductConsumer1 chamado de p1.

    O accept do produt consumer é aumentar o preco do produto em 10%

    Esse é o consumer
     */
    @Override
    public void accept (ProductConsumer4 p2) {

        p2.setPrice (p2.getPrice () * 1.1);
    }
}
