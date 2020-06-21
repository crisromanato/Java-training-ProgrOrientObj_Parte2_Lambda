package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Consumer.Case3_RefMeth_MethNaoEstatico.util;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Consumer.Case3_RefMeth_MethNaoEstatico.entities.ProductConsumer3;

import java.util.function.Consumer;

public class PriceUpdateConsumer3 implements Consumer <ProductConsumer3> {

    /*
    implementacao do contrato recebendo o ProductConsumer1 chamado de p1.

    O accept do produt consumer é aumentar o preco do produto em 10%

    Esse é o consumer
     */
    @Override
    public void accept (ProductConsumer3 p3) {

        p3.setPrice (p3.getPrice () * 1.1);
    }
}
