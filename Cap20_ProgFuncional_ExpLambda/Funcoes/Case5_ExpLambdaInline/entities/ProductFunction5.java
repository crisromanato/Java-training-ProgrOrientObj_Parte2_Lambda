package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Funcoes.Case5_ExpLambdaInline.entities;
/*
nao utilizou
 */
public class ProductFunction5 {
    private String name;
    private Double price;

    public ProductFunction5 (String name, Double price) {
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

    public  String nonStaticUpperCaseName (){

        return name.toUpperCase ();
    }

    @Override
    public String toString() {

        return name + ", " + String.format("%.2f", price);
    }
}