package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case2_Impl_Interface.util;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case2_Impl_Interface.entitites.ProductPred2;

import java.util.function.Predicate;

public class ProductPredicate2 implements Predicate<ProductPred2> {
/*
implementacao do contrato da interface funcional pq tem somente um method
abstrato pra ser implementado.
Veja que é um metodo test
 */
    @Override
    public boolean test (ProductPred2 p) {
/*
excluir da lista os produtos >=100.
vai me retornar um boolean
 */
        return p.getPrice() >= 100.0;
    }
}
