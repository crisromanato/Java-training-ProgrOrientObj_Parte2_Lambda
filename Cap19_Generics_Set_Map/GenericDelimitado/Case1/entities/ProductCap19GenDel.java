package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.GenericDelimitado.Case1.entities;

public class ProductCap19GenDel {

    private String name;

    private Double price;



    public ProductCap19GenDel (String name, Double price) {

        this.name = name;

        this.price = price;

    }



    public String getName() {

        return name;

    }



    public void setName(String name) {

        this.name = name;

    }



    public Double getPrice() {

        return price;

    }



    public void setPrice(Double price) {

        this.price = price;

    }



    @Override

    public String toString() {

        return name + ", " + String.format("%.2f", price);

    }
}
