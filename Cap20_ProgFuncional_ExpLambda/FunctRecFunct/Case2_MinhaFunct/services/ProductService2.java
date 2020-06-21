package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.FunctRecFunct.Case2_MinhaFunct.services;




import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.FunctRecFunct.Case2_MinhaFunct.entities.ProductMinhaFunction2;

import java.util.List;
import java.util.function.Predicate;

/*

metodo filteredSum, vai somar somente os preços de uma lista onde
o nome comece com a letra t
 */
public class ProductService2 {


public double filteredSum (List<ProductMinhaFunction2> list, Predicate<ProductMinhaFunction2> criteria) {
    /*
    iniciado a variavel valendo 0
     */
    double sum = 0.0;
    /*
    percorrer a lista e para cada item da lista iniciado com T sera
    somado a lista sum.

    agora vamos melhor essa chamada dos produtos iniciados com a letra
        t no productService, pois se fosse outra condicao teriamos que
        mudar a classe prodservice.
        E entramos no problema de que a classe product service nao esta
        fechada para alteracao, ou seja é um ponto ruim de manutencao
        assim vamos mudar o programa para receber a condicao como
        parametro da funcao.
        Dentro do :
        public double filteredSum (List<ProductMinhaFunction1> list, ???)
        vamos criar o parametro e subistituir no nosso predicato do tipo
        product.
        if (p.getName ().charAt (0) == 'T')

        O predicado acima esta testando se o nome comeca com T e a resposta
        da um verdadeiro ou falso.

trocando o predicado acima pelo parametro criteria.test que vai fazer um
teste generico de qualquer predicado recebido acima como parametro

     */
    for ( ProductMinhaFunction2 p : list ) {
        if (criteria.test (p)) {
            sum += p.getPrice ();
        }
    }
    return sum;
    }
    }

