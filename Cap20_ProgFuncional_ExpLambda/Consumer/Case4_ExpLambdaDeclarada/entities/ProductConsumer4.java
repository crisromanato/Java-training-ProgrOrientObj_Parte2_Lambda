package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Consumer.Case4_ExpLambdaDeclarada.entities;

public class ProductConsumer4 {
    private String name;
    private Double price;

    public ProductConsumer4 (String name, Double price) {
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

    public static void staticPriceUpdate (ProductConsumer4 p3){

        p3.setPrice (p3.getPrice () * 1.1);
    }

    public void nonStaticPriceUpdate (){

        setPrice (getPrice () * 1.1);
    }

    @Override
    public String toString() {

        return name + ", " + String.format("%.2f", price);
    }
}