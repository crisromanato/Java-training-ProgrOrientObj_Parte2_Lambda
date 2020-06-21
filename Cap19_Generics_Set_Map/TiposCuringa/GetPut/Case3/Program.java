    package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.TiposCuringa.GetPut.Case3;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

    /*

    Problema 2 (princípio get/put)

    Vamos fazer um método que copia os elementos de uma lista para uma outra
    lista que pode ser mais genérica que a primeira.

    List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
    List<Double> myDoubles = Arrays.asList(3.14, 6.28);
    List<Object> myObjs = new ArrayList<Object>();

    copy(myInts, myObjs);

    copy(myDoubles, myObjs);

    https://stackoverflow.com/questions/1368166/what-is-a-difference-between-super-e-and-extends-e


     */
    public class Program {
        public static void main (String[] args) {

            List<Integer> myInts    = Arrays.asList (1, 2, 3, 4);
            List<Double>  myDoubles = Arrays.asList(3.14, 6.28);
            List<Object> myObjs = new ArrayList<Object> ();

            copy(myInts, myObjs);
            /*
            para ver o resultado da copia da lista de inteiros
             */
            printlist (myObjs);
            copy(myDoubles, myObjs);
            /*
            para ver o resultado da copia da lista de doubles
             */
            //printlist (myDoubles);
            printlist (myObjs);
        }
        /*
        a lista de origem vai ser uma lista de qualquer tipo numerico
        public static void copy(List<? extends Number> source,

        A lista de destino, é mais generica entao vai ser uma lista de
        qualquer tipo de Number.
        List<? super Number> destiny ){
             */
        public static void copy(List<? extends Number> source, List<? super
                Number> destiny ){
            /*
        Para copiar vamos fazer um for:
        A lista de origem é um caso de covariancia entao posso acessar os elementos
        A lista de destino é um caso de contravariancia trabalha com os supertipos
        informados, entao eu posso adicionar.
            */
            for (Number number : source){
                destiny.add(number);
            }
        }
        /*
        para ver funcionando vamos fazer um metodo generic para imprimir
         */
        public static void printlist(List<?> list){
            /*
            percorrer a lista
             */
            for (Object obj : list) {
                System.out.print (obj + " ");
            }
            System.out.println ();
        }
    }
