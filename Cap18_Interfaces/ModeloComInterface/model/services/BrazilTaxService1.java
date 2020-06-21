package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloComInterface.model.services;
/*
usando interface pra implementar o tax service interface
cumpre o contrato taxservice

 */
public class BrazilTaxService1 implements TaxService1{
/*
metodo tax estamos usando o tipo primitivo double pq
estamos assumindo que sempre teremos um valor no calculo
se fosse obter valor nulo usariamos o Wrapper.

A classe cumpre o contrato de interface com TaxService.
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
