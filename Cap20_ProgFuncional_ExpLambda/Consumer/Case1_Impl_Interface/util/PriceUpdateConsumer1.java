package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Consumer.Case1_Impl_Interface.util;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Consumer.Case1_Impl_Interface.entities.ProductConsumer1;

import java.util.function.Consumer;

public class PriceUpdateConsumer1 implements Consumer <ProductConsumer1> {

    /*
    implementacao do contrato recebendo o ProductConsumer1 chamado de p1.

    O accept do produt consumer é aumentar o preco do produto em 10%

    Esse é o consumer
     */
    @Override
    public void accept (ProductConsumer1 p1) {
        p1.setPrice (p1.getPrice () * 1.1);
    }
}
