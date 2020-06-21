package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.TiposCuringa.Case1;
/*
Tipos curinga (wildcardtypes)

Genericssão invariantes

List<Object> não é o supertipo de qualquer tipo de lista:

List<Object> myObjs = new ArrayList<Object>();
List<Integer> myNumbers = new ArrayList<Integer>();
myObjs = myNumbers; // erro de compilação


O supertipo de qualquer tipo de lista é List<?>.
Este é um tipo curinga:

List<?> myObjs = new ArrayList<Object>();
List<Integer> myNumbers = new ArrayList<Integer>();
myObjs = myNumbers;

 */
public class ProgramCuringa1 {
    public static void main (String[] args) {
       java.util.List<Object> myObjs = new java.util.ArrayList<Object> ();
    /*
    neste caso podemos entender q o list Integer nao é um subtipo de list obj
    nao da pra fazer um upcasting.
     */
        java.util.List<Integer> myNumbers = new java.util.ArrayList<Integer> ();
        //myObjs = myNumbers; // erro de compilação

    /*
    é diferente quando fazemos
     */

        Object obj;
        Integer x = 10;
        obj = x;

/*
O supertipo de qualquer tipo de lista é List<?>.
Este é um tipo curinga:

No caso abaixo o compilador acetia.
 */

        java.util.List<?>       myObjs1    = new java.util.ArrayList<Object> ();
        java.util.List<Integer> myNumbers1 = new java.util.ArrayList<Integer> ();
        myObjs1 = myNumbers1;

        Object objt;
        Integer x1 = 10;
        obj = x1;
    }


}
