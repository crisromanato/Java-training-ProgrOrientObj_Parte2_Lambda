package ProgramacaoOrientadaObjetos_Parte2_Lambda.HashCode_Equals.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.HashCode_Equals.entities.Client;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.HashCode_Equals.entities.Client_2campos;

public class Hashcode_EqualsPersonalizados2campos {
    public static void main (String[] args) {

        Client_2campos c1 = new Client_2campos ("Maria", "maria@gmail.com");
        Client_2campos c2 = new Client_2campos ("Maria", "alex@gmail.com");

        System.out.println (    c1.hashCode ());
        System.out.println (    c2.hashCode ());
        System.out.println (    c1.equals (c2));
    }
}
