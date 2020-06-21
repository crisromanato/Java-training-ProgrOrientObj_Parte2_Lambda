package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.TiposCuringa.GetPut.Case2;

import java.util.ArrayList;
import java.util.List;

/*
Princípio get/put-contravariância



 */
public class ProgramContravariancia {
    public static void main (String[] args) {

        List<Object> myObjs = new ArrayList<Object> ();
        myObjs.add("Maria");
        myObjs.add("Alex");

        /*
        vou declarar uma lista qualquer tipo super number
        essa lista pode ser tanto numbers quanto obj.
        Podemos add mas nao podemos accessar os obj da lista.
         */
        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);

        
        //Number x = myNums.get(0); // erro de compilacao
        //get-ERROR
        //put-OK
    }
}
