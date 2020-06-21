package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrInterface.model.entities;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrInterface.model.enums.Color;

public abstract class AbstractShape implements Shape {

    private Color color;


    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
}
