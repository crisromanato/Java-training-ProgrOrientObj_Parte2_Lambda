package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.DefaultMethods.Case1b.services;

import java.security.InvalidParameterException;
/*
analise deste codigo, continuamos com repeticao de taxa de juros e pagamento
nesta classe e também na dos Brazil
No Case1c entramos com o default method para elminar isso.
 */

public class UsaInterestService implements InterestService {

	private double interestRate;

	public UsaInterestService(double interestRate) {

		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {

		return interestRate;
	}

	@Override
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
