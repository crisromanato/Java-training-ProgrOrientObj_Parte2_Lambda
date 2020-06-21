package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.TiposCuringa.CuringaDelimitado.entities;
/*
implementa a interface shape
 */
public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
