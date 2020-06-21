package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap20_ProgFuncional_ExpLambda.Predicate.Case3_RefMeth_MethEstatico.entitites;

public class ProductPred3 {
    private String name;
    private Double price;

    public ProductPred3 (String name, Double price) {
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

    public static boolean staticProductPredicate3 (ProductPred3 p){
        return p.getPrice () >= 100.0;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}