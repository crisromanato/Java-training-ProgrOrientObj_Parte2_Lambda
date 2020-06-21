package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case6_ExpLambdaInline.entitites;

public class ProductPred6 {
    private String name;
    private Double price;

    public ProductPred6 (String name, Double price) {
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
/*
 metodo nao estatico trabalha com o produto q vc passar para ele
 */
    public static boolean staticProductPredicate3 (ProductPred6 p){

        return p.getPrice () >= 100.0;
    }

    /*
    metodo nao estatico trabalha com a instancia entao ele pega
    o objeto da instancia onde estamos.
     */
    public  boolean nonStaticProductPredicate4 (){

        return price  >= 100.0;
    }
    @Override
    public String toString() {

        return name + ", " + String.format("%.2f", price);
    }
}