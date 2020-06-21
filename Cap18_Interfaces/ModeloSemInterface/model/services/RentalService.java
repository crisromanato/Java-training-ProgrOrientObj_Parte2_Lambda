package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloSemInterface.model.services;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloSemInterface.model.entities.Invoice;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloSemInterface.model.entities.CarRental;

public class RentalService {
    /*
    atributos
    estamos usando o tipo Wrapper pq
estamos assumindo que se tivermos valor nulo o wrapper vai
tratar e esta padronizado com o banco de dados
     */
    private Double pricePerDay;
    private Double pricePerHour;
    /*
    associacao com a classe braziltaxservice
     */
    private BrazilTaxService taxService;

/*
construtor com argumentos - nota associado BrazilTaxService
falando um pouco de :
Inversão de controle, Injeção de dependência
neste modelo temos:
 Acoplamento forte
 • A classe RentalService conhece a dependência concreta (BrazilTaxService)
 • Se a classe concreta mudar, é preciso mudar a classe RentalService e também
 o programa q ocorreu a alteracao ex. taxUSA.
 */

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }


/*
metodo para processar invoice recebendo um car rental como argumento
vamos pro toda a logica para calculo por dia e horas
No java a data é armazanada em milisegundos

 */
    public void processInvoice(CarRental carRental) {
        /*
        criando uma variavel para cada data
        o get.time pega a data em milesegundos
         */
        long t1 = carRental.getStart().getTime();
        long t2 = carRental.getFinish().getTime();
        /*
        variavel recebendo a dif em horas.
        pegar a dif em milisegundos e dividir por mil pra
        chegar em segundos dividindo por 60 duas vezes chegamos
        em horas
        Nota feito um casting pra garantir que o resultado vai
        chegar em double, pois queremos o valor das horas
        quebrados pra fazer o arredondamento depois.

         */
        double hours = (double)(t2 - t1) / 1000 / 60 / 60;

        /*
        declarado a varial fora do escopo do if pois vamos
        usar em outros casos.
         */
        double basicPayment;
        if (hours <= 12.0) {
            /*
            para arredondar as horas usamos o Math.ceil
             */
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
           basicPayment = pricePerDay * Math.ceil(hours / 24);
        }
        /*
        para calculo do imposto vamos usar o tax service
        a partir do basic pyment
         */
        double tax = taxService.tax(basicPayment);
        /*
        Ir no callrental que é meu objeto - vamos fazer
        um set invoice e instanciando o objeto de invoice
        usando os parametros obtidos acima (basicPayment, tax).
        Criamos um objeto invoice e associamos ao objeto aluguel.
         */

        carRental.setInvoice(new Invoice(basicPayment, tax));

    }
}
