package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloSemInterface.model.services;

public class BrazilTaxService  {
/*
metodo tax estamos usando o tipo primitivo double pq
estamos assumindo que sempre teremos um valor no calculo
se fosse obter valor nulo usariamos o Wrapper.
 */

    public double tax(double amount) {
        if (amount <= 100.0) {
            return amount * 0.2;
        }
        else {
            return amount * 0.15;
        }

    }
}
