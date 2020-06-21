package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloComInterface.model.entities;

public class Invoice {
    /*
    atributos
    estamos usando o tipo Wrapper pq
estamos assumindo que se tivermos valor nulo o wrapper vai
tratar e esta padronizado com o banco de dados
     */

    private Double basicPayment;
    private Double tax;

/*
construtor padrao
 */
    public Invoice() {
    }

/*
construtor com argumentos
 */

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

/*
getters(return) and setters (this)
 */

    public Double getBasicPayment() {
        return basicPayment;
    }
    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }
    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    public Double getTotalPayment() {
        return getBasicPayment() + getTax();
    }
}
