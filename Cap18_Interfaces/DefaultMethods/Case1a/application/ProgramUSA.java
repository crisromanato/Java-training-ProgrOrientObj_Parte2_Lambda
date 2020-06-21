package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.DefaultMethods.Case1a.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.DefaultMethods.Case1a.service.BrazilInterestService;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.DefaultMethods.Case1b.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;
/*
Default methods

Default methods(defender methods)
• A partir do Java 8, interfaces podem conter métodos concretos.
	Podem ter também metodos estaticos e privados.

• A intenção básica é prover implementação padrão para métodos, de modo a
evitar:
	• 1) repetição de implementação em toda classe que implemente a interface
	• 2) a necessidade de se criar classes abstratas para prover reuso da
	implementação

• Outras vantagens:
	• Manter a retrocompatibilidadecom sistemas existentes
	• Permitir que "interfaces funcionais - vamos ver no cap. expressoes lambda"
	(que devem conter apenas um método) possam prover outras operações
	padrão reutilizáveis


Problema exemplo
Fazer um programa para ler uma quantia e a duração em meses de um empréstimo.
Informar o valor a ser pago depois de decorrido o prazo do empréstimo, conforme
regras de juros do Brasil. A regra de cálculo de juros do Brasil é juro
composto padrão de 2% ao mês.

A palavra default identifica o metodo quando implementado em uma interface.

Example
Amount: 200.00
Months: 3
Payment after 3 months:
212.24

Calculations: 	Payment = 200 * 1.02 * 1.02 * 1.02 = 200 * 1.023 = 212.2416
				Payment = amount * (1 + interestRate / 100)N

What if there was another interest service from another country?

Example USA
Amount: 200.00
Months: 3
Payment after 3 months:
206.06

Calculations: 	Payment = 200 * 1.01 * 1.01 * 1.01 = 200 * 1.013 = 206.0602
				Payment = amount * (1 + interestRate / 100)N

https://github.com/acenelio/interfaces5-java

Tivemos uma repeticao de codigo.

Para termos uma possibilidade de reuso e polimorfismo vamos fazer o case1b
 */

public class ProgramUSA {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
/*
ler a quantida e os meses
 */
        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();
/*
instanciado a classe BrazilInterestService e ler a taxa de juros
 */
        UsaInterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        sc.close();
    }
}
