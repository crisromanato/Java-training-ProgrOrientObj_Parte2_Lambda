package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.FunctRecFunct.Case1_MinhaFunc.model.services;




import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.FunctRecFunct.Case1_MinhaFunc.entities.ProductMinhaFunction1;

import java.util.List;
import java.util.function.Function;

/*

metodo filteredSum, vai somar somente os preços de uma lista onde
o nome comece com a letra t
 */
public class ProductService1 {


public double filteredSum (List<ProductMinhaFunction1> list) {
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
     */
    for ( ProductMinhaFunction1 p : list ) {
        if (p.getName ().charAt (0) == 'T') {
            sum += p.getPrice ();
        }
    }
    return sum;
    }
    }

