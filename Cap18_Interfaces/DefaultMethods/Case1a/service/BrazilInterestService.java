package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.DefaultMethods.Case1a.service;

import java.security.InvalidParameterException;

public class BrazilInterestService {
    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
/*
programacao defensiva testando se a qt de meses for menor q um lanca
uma excecao, senao calcula o payment.
 */

    public double payment(double amount, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        }
        /*
        Math.pow é a potenciacao
         */
        return amount * Math.pow(1.0 + interestRate / 100.0, months);
    }
}
