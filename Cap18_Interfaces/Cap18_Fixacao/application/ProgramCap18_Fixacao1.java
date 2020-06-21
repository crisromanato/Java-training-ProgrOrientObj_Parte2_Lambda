package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_Fixacao.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_Fixacao.model.entities.Contract;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_Fixacao.model.entities.Installment;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_Fixacao.model.services.ContractService;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_Fixacao.model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*

Exercício de fixação
http://educandoweb.com.br
Prof. Dr. Nelio Alves


Uma empresa deseja automatizar o processamento de seus contratos.
O processamento de um contrato consiste em gerar as parcelas a
serem pagas para aquele contrato, com base no número de meses desejado.

A empresa utiliza um serviço de pagamento online para realizar o pagamento
 das parcelas.
 Os serviços de pagamento online tipicamente cobram um juro mensal, bem
 como uma taxa por pagamento.
 Por enquanto, o serviço contratado pela empresa é o do Paypal, que
 aplica juros simples de 1% a cada parcela, mais uma taxa de pagamento de 2%.

Fazer um programa para ler os dados de um contrato
(número do contrato, data do contrato, e valor total do contrato).
Em seguida, o programa deve ler o número de meses para parcelamento do
contrato, e daí gerar os registros de parcelas a serem pagas
(data e valor), sendo a primeira parcela a ser paga um mês após a data do
 contrato, a segunda parcela dois meses após o contrato e assim por diante.
 Mostrar os dados das parcelas na tela.

 Example:

Enter contract data
Number: 8028
Date (dd/MM/yyyy): 25/06/2018
Contract value: 600.00
Enter number of installments: 3
Installments:
25/07/2018 - 206.04
25/08/2018 - 208.08
25/09/2018 - 210.12

Calculations(1% monthlysimpleinterest+ 2% paymentfee):

Quota #1:
200 + 1% * 1 = 202
202 + 2% = 206.04

Quota #2:
200 + 1% * 2 = 204
204 + 2% = 208.08

Quota #3:
200 + 1% * 3 = 206
206 + 2% = 210.12

Domain layerdesign (entities)
Contract (number, date, totalValue)
Installment (parcelas) - DueDate, amount

Service layer design
ContractService (processContract (months)
OnlinePaymentService - interface (paymentFee - amount, interest - amount, mounths)
PaypalService - (paymentFee - amount, interest - amount, mounths)

Repositório Github
https://github.com/acenelio/interfaces4-java



 */
public class ProgramCap18_Fixacao1 {
    public static void main(String[] args) throws ParseException {


/*
configuracao basica
 */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*

         */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");



        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();


        Contract contract = new Contract(number, date, totalValue);


        System.out.print("Enter number of installments: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, n);

        System.out.println("Installments:");

        for (Installment x : contract.getInstallments()) {
            System.out.println(x);
        }

        sc.close();
    }
}
