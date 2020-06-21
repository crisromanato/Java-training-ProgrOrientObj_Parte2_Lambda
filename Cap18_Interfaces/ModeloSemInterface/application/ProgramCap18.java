package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloSemInterface.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloSemInterface.model.entities.CarRental;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloSemInterface.model.entities.Vehicle;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloSemInterface.model.services.BrazilTaxService;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloSemInterface.model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
Aviso
• A partir do Java 8, interfaces podem ter "default methods" ou "defender
methods"
• Isso possui implicações conceituais e práticas, que serão discutidas
mais à frente neste capítulo
• Primeiro vamos trabalhar com a definição "clássica" de interfaces.
Depois vamos acrescentar o conceito de default methods.

Interface
Interface é um tipo que define um conjunto de operações que uma
classe deve implementar.
eg. figura tem area e perimetro
a interface só define as operacoes

A interface estabelece um contrato que a classe deve cumprir.

Pra quê interfaces?
• Para criar sistemas com baixo acoplamento e flexíveis.



Problema exemplo
Uma locadora brasileira de carros cobra um valor por hora para locações
de até 12 horas. Porém, se a duração da locação ultrapassar 12 horas,
a locação será cobrada com base em um valor diário.

Além do valor da locação, é acrescido no preço o valor do imposto
conforme regras do país que, no caso do Brasil, é 20% para valores
até 100.00, ou 15% para valores acima de 100.00.

Fazer um programa que lê os dados da locação
(modelo do carro, instante inicial e final da locação),

bem como o valor por hora e o valor diário de locação.
O programa deve então gerar a nota de pagamento
(contendo valor da locação, valor do imposto e valor total do pagamento)
e informar os dados na tela. Veja os exemplos.


Example1:
Enter rental data
Car model: Civic
Pickup (dd/MM/yyyy hh:mm): 25/06/2018 10:30
Return (dd/MM/yyyy hh:mm): 25/06/2018 14:40
Enter price per hour: 10.00
Enter price per day: 130.00
INVOICE: Basic payment: 50.00
Tax: 10.00
Total payment: 60.00

Calculations:
Duration = (25/06/2018 14:40) - (25/06/2018 10:30) = 4:10 = 5 hours
Basic payment = 5 * 10 = 50

Tax = 50 * 20% = 50 * 0.2 = 10

Example2:
Enter rental data
Car model: Civic
Pickup (dd/MM/yyyy hh:mm): 25/06/2018 10:30
Return (dd/MM/yyyy hh:mm): 27/06/2018 11:40
Enter price per hour: 10.00
Enter price per day: 130.00
INVOICE: Basic payment: 390.00
Tax: 58.50
Total payment: 448.50

Calculations:
Duration = (27/06/2018 11:40) - (25/06/2018 10:30) = 2 days + 1:10 = 3 days
Basic payment = 3 * 130 = 390

Tax = 390 * 15% = 390 * 0.15 = 58.50

Projeto no Github

https://github.com/acenelio/interfaces1-java

recordando:
cap composicao
teremos agora também servicos alem das entities que vimos

entidades vamos ter: ambos associados ( Domain layer design)
Vehicle (modelo)
CarRental (inicio e fim)
Invoice (valores a pagar) custo + tax

services vamos ter: ambos associados (Service Layer Design) no interface
vamos fazer um processo sem interface e depois com interface
Rental Service (preco por hora e dia) + proc da invoice + tax
BrazilTaxService (responsabilidade do imposto)





 */

public class ProgramCap18 {
    /*
    add throws ParseException para nao precisar tratar excecoes
     */
    public static void main(String[] args) throws ParseException {

/*
configuracao basica
 */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
para tratar as datas
         */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

/*
comecar colocando os dados que o usuario vai digitar
 */

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
        Date start = sdf.parse(sc.nextLine());
        System.out.print("Return (dd/MM/yyyy HH:mm): ");
        Date finish = sdf.parse(sc.nextLine());
/*
criar um novo objeto do tipo CarRental pra receber os dados do carro

 */
        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
/*
entrada do usuario dos preços por hora e dia
 */
        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();
/*
instanciar o RentalService e o tex service instanciamos o brazil tax seervice

falando um pouco de :
Inversão de controle, Injeção de dependência
neste modelo temos:
 Acoplamento forte
 • A classe RentalService conhece a dependência concreta (BrazilTaxService)
 • Se a classe concreta mudar, é preciso mudar a classe RentalService e também
 o programa que gerou a alteracao ex. taxUSA.


 */
        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
/*
accesar o rental service e processar a invoice.
 */
        rentalService.processInvoice(cr);
/*
imprimir os dados da invoice
 */
        System.out.println("INVOICE:");
        System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));


        sc.close();

    }
}
