package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.GenericDelimitado.Case2.services;

import java.util.List;
/*
classe usando o generics e comparable
Estou dizendo que o meu metodo vai trabalhar com o tipo T desde que T
seja um subtipo de comparable T

tenho também q dizer qual classe implementa o comparable (eg. Calculation
Service
 */
public class CalculationService {
    /*
    versao alternativa completa

    public static <T extends Comparable<? super T>> T max(List<T> list)

    ou seja é um tipo comparavel T ou qualquer super classe de T
    No caso da classe de produto pode ser o produto ou qualquer
    super classe de produto.

    Porque se alguma super classe do meu produto tiver o compare to
    o produto vai herdar também o compare to.

    O topico super vamos ver em tipos curinga logo a frente.
     */
    public static <T extends Comparable<T>> T max(List<T> list) {

        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }

        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
