package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case4_RefMeth_MethNaoEstatico.util;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case4_RefMeth_MethNaoEstatico.entitites.ProductPred4;

import java.util.function.Predicate;

public class ProductPredicate4 implements Predicate<ProductPred4> {
/*
implementacao do contrato da interface funcional pq tem somente um method
abstrato pra ser implementado.
Veja que é um metodo test
 */
    @Override
    public boolean test (ProductPred4 p) {
/*
excluir da lista os produtos >=100.
vai me retornar um boolean
 */
        return p.getPrice() >= 100.0;
    }
}
