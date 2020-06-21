package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrata.model.entities;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_HerdarxCumprirContract.ClasseAbstrata.model.enums.Color;

public class Retangle extends Shape {



    private Double width;

    private Double height;

    public Retangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }


    public Double getWidth() {
        return width;
    }
    public void setWidth(Double width) {
        this.width = width;
    }


    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
       this.height = height;
    }



    @Override
    public double area() {
        return width * height;
    }
}
