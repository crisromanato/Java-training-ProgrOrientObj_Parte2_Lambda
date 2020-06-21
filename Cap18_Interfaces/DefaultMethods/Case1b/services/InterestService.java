package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.DefaultMethods.Case1b.services;

import java.security.InvalidParameterException;

public interface InterestService {

	double getInterestRate();
	double payment(double amount, int months);

	}
