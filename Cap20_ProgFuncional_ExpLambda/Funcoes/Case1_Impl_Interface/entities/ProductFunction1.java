package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Funcoes.Case1_Impl_Interface.entities;

public class ProductFunction1 {
    private String name;
    private Double price;

    public ProductFunction1 (String name, Double price) {
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

    public static String staticUpperCaseName(ProductFunction1 p){
        return p.getName ().toUpperCase ();
    }

    @Override
    public String toString() {

        return name + ", " + String.format("%.2f", price);
    }
}