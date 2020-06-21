package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrata.model.entities;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrata.model.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }


    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
