package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Consumer.Case2_RefMeth_MethEstatico.entities;

public class ProductConsumer2 {
    private String name;
    private Double price;

    public ProductConsumer2 (String name, Double price) {
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

    public static void staticPriceUpdate(ProductConsumer2 p2){
        p2.setPrice (p2.getPrice () * 1.1);
    }

    @Override
    public String toString() {

        return name + ", " + String.format("%.2f", price);
    }
}