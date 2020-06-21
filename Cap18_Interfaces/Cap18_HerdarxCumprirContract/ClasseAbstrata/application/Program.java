package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrata.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrata.model.entities.Circle;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrata.model.entities.Retangle;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrata.model.entities.Shape;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrata.model.enums.Color;




public class Program {
    public static void main(String[] args) {


        Shape s1 = new Circle(Color.BLACK, 2.0);
        Shape s2 = new Retangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));

    }
}
