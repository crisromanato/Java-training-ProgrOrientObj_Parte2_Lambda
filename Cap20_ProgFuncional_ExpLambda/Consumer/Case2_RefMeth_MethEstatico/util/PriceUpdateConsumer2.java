package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Consumer.Case2_RefMeth_MethEstatico.util;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Consumer.Case2_RefMeth_MethEstatico.entities.ProductConsumer2;

import java.util.function.Consumer;

public class PriceUpdateConsumer2 implements Consumer <ProductConsumer2> {

    /*
    implementacao do contrato recebendo o ProductConsumer1 chamado de p1.

    O accept do produt consumer é aumentar o preco do produto em 10%

    Esse é o consumer
     */
    @Override
    public void accept (ProductConsumer2 p2) {

        p2.setPrice (p2.getPrice () * 1.1);
    }
}
