package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.DefaultMethods.Case1b.services;

import java.security.InvalidParameterException;
/*
analise deste codigo, continuamos com repeticao de taxa de juros e pagamento
nesta classe e também na dos USA
No Case1c entramos com o default method para elminar isso.
 */
public class BrazilInterestService implements InterestService {

	private double interestRate;

	public BrazilInterestService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

	/*
programacao defensiva testando se a qt de meses for menor q um lanca
uma excecao, senao calcula o payment.
 */
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
