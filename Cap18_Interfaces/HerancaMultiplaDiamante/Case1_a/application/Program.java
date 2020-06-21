package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.HerancaMultiplaDiamante.Case1_a.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.HerancaMultiplaDiamante.Case1_a.devices.Printer;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.HerancaMultiplaDiamante.Case1_a.devices.Scanner;

public class Program {
    public static void main(String[] args) {

        Printer p = new Printer("1080");
        p.processDoc("My letter");
        p.print("My Letter");

        Scanner s = new Scanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());
    }
}
