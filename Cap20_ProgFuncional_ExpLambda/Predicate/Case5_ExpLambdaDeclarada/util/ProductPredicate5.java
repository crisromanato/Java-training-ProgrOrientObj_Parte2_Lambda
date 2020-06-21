package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case5_ExpLambdaDeclarada.util;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case5_ExpLambdaDeclarada.entitites.ProductPred5;

import java.util.function.Predicate;

public class ProductPredicate5 implements Predicate<ProductPred5> {
/*
implementacao do contrato da interface funcional pq tem somente um method
abstrato pra ser implementado.
Veja que é um metodo test
 */
    @Override
    public boolean test (ProductPred5 p) {
/*
excluir da lista os produtos >=100.
vai me retornar um boolean
 */
        return p.getPrice() >= 100.0;
    }
}
