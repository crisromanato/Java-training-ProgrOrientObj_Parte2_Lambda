package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrInterface.model.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrInterface.model.entities.AbstractShape;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrInterface.model.entities.Circle;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrInterface.model.entities.Retangle;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrInterface.model.enums.Color;


/*

 */
public class ProgramHerdarxCumprirContract {
    public static void main(String[] args) {



        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Retangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));

    }

}
