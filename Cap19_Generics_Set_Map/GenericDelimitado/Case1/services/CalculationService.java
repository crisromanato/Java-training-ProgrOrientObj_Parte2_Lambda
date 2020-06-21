package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.GenericDelimitado.Case1.services;

import java.util.List;

public class CalculationService {
/*
por ser uma operacao estatica nao preciso instanciar o calculation service
é uma operacao q recebe uma lista de inteiros
 */
    public static Integer max(List<Integer> list) {
        /*
        programcao defensiva
         */
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        /*
        variavel para pegar o primeiro item da lista
         */
        Integer max = list.get(0);
        /*
        laco for each comparando se cada item da lista é maior que o max
        usando a funcao comparable do cap anterior.
         */
        for (Integer item : list) {
            /*
            chamo o primeiro objeto e comparo com o segundo objeto e se for
            um resultado maior que 0 significa que o primeiro é maior q o
            segundo e neste caso atualizamos a variavel max.
            FAzendo isso para todos os elementos da lista no final
            teremos o maior elemento da lista.
             */
            if (item.compareTo(max) > 0) {
                max = item;

                /*
                forma simples de encontar o maior de uma lista de uma
                forma programatica.

                No momento achamos o maior numa lista de inteiros.
                No segundo caso iremos achar o maior numa lista de produtos

                 */
            }
        }
        return max;
    }
}
