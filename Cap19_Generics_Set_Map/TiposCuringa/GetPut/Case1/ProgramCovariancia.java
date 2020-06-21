package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.TiposCuringa.GetPut.Case1;

import java.util.ArrayList;
import java.util.List;

/*
Problema 2 (princípio get/put)
Vamos fazer um método que copia os elementos de uma lista para uma
outra lista que pode ser mais genérica que a primeira.

Criamos algumas listas e iniciamos com alguns valores.
List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
List<Double> myDoubles = Arrays.asList(3.14, 6.28);
List<Object> myObjs = new ArrayList<Object>();

E quero crair uma operacoa para copiar de uma lista para outra.

copy(myInts, myObjs);

copy(myDoubles, myObjs);


https://stackoverflow.com/questions/1368166/what-is-a-difference-between-super-e-and-extends-e

Obs:
VAmos usar os Java Wrapper types.

Os tipos numericos tem uma super classe (Number) e esta antes do object.


Caso Covariancia

Princípio get/put-covariância

1. Você instancia a lista e insere alguns numeros
List<Integer> intList = new ArrayList<Integer>();
intList.add(10);
intList.add(5);

2. Vamos criar uma lista de qualquer tipo q seja subtipo de number
estou declarando uma variavel list e a variavel recebe o intList
Até aqui podemos fazer.
Estamos atribuindo uma lista especifica (intList) para uma variavel do
tipo mais generico (List)
List<? extends Number> list = intList;

3. Quando fazemos o processo acima podemos acerrar os elementos ex.
fazendo um get.
Number x = list.get(0);

4. Porém nao podemos adicionar elementos a lista
Porque o compilador nao sabe se o numero eg. 20 é compativel com algum
outro possivel tipo number q possa ser minha lista.
list.add(20); // erro de compilacao

get-OK
put-ERROR


 */
public class ProgramCovariancia {
    public static void main (String[] args) {
        List<Integer> intList = new ArrayList<Integer> ();
        intList.add (10);
        intList.add (5);
        List<? extends Number> list = intList;
        Number x = list.get(0);
        //list.add(20); // erro de compilacao
        //get-OK
        //put-ERROR
    }

}
