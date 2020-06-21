package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloSemInterface.model.entities;

public class Vehicle {

    private String model;

    /* construtor padrao

     */
    public Vehicle() {
    }

    /*
    construtor com argumento
     */
    public Vehicle(String model) {
        this.model = model;
    }

/*
getters and setters
 */

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}
