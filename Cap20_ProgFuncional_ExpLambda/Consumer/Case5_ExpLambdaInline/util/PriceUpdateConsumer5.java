package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Consumer.Case5_ExpLambdaInline.util;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Consumer.Case5_ExpLambdaInline.entities.ProductConsumer5;

import java.util.function.Consumer;

public class PriceUpdateConsumer5 implements Consumer <ProductConsumer5> {

    /*
    implementacao do contrato recebendo o ProductConsumer1 chamado de p1.

    O accept do produt consumer é aumentar o preco do produto em 10%

    Esse é o consumer
     */
    @Override
    public void accept (ProductConsumer5 p5) {

        p5.setPrice (p5.getPrice () * 1.1);
    }
}
