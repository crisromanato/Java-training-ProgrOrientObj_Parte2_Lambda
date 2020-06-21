package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.DefaultMethods.Case1c.services;

/*
No Case1c entramos com o default method para elminar a repeticao de codigo.
retiramos o metodo payment das classes Usa e BrazilInterestService e colocamos
na interface utilizando o default method.
Note que foi alterado de public para default.

No InterestRate também foi alterado para pegar direto o valor da classe especifica
no nosso caso estara dentro do programa principal.

alterado de :
return amount * Math.pow(1.0 + interestRate / 100.0, months);

Para:
return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
 */

import java.security.InvalidParameterException;

public interface InterestService {

	double getInterestRate();

	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
