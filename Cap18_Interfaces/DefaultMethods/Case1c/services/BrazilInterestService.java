package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.DefaultMethods.Case1c.services;

/*
No Case1c entramos com o default method para elminar a repeticao de codigo.
retiramos o metodo payment das classes Usa e BrazilInterestService e colocamos
na interface utilizando o default method.

o interestRate não pode ser feito via default method por se tratar de um estado.
Não se pode implementar via default method também construtores.

Considerações importantes
• Sim: agora as interfaces podem prover reuso

• Sim: agora temos uma forma de herança múltipla
	• Mas o compilador reclama se houver mais de um método com a mesma
		assinatura, obrigando a sobrescreve-lo

• Interfaces ainda são bem diferentes de classes abstratas.
	Interfaces não possuem recursos tais como construtores e atributos.
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
}
