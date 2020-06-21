package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap17_TrabalhandoArquivos.TA_ExercProposto.entities;

public class ProductCap17 {

/*
variaveis do produto
 */
    private String name;
    private Double price;
    private Integer quantity;

/*
construtor do produto
 */

    public ProductCap17(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    /*
    getters and setters
     */
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

/*
metodo para calcular preco total de cada produto
 */

    public double total() {
        return price * quantity;
    }

}
