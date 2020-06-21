package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case3_RefMeth_MethEstatico.util;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case3_RefMeth_MethEstatico.entitites.ProductPred3;

import java.util.function.Predicate;

public class ProductPredicate3 implements Predicate<ProductPred3> {
/*
implementacao do contrato da interface funcional pq tem somente um method
abstrato pra ser implementado.
Veja que é um metodo test
 */
    @Override
    public boolean test (ProductPred3 p) {
/*
excluir da lista os produtos >=100.
vai me retornar um boolean
 */
        return p.getPrice() >= 100.0;
    }
}
