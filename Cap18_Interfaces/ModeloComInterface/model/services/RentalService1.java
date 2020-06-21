package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloComInterface.model.services;
/*
Inversão de controle

• Inversão de controle
        Padrão de desenvolvimento que consiste em retirar da classe a
        responsabilidade de instanciar suas dependências.

• Injeção de dependência
        É uma forma de realizar a inversão de controle: um componente
        externo instancia a dependência, que é então injetada no
        objeto "pai". Pode ser implementadadeváriasformas:
            • Construtor
            • Classe de instanciação (builder/factory)
            • Container/framework
 */
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloComInterface.model.entities.CarRental1;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloComInterface.model.entities.Invoice;

public class RentalService1 {
    /*
    atributos
    estamos usando o tipo Wrapper pq
estamos assumindo que se tivermos valor nulo o wrapper vai
tratar e esta padronizado com o banco de dados
     */
    private Double pricePerDay;
    private Double pricePerHour;
    /*
    associacao com a classe braziltaxservice nao é uma boa pratica
    sig q meu programa tem dois pontos de alteracao no rental e
    no serviço de imposto.
    Parqa evitar isso usamos a interface. com uma classe abstrata
     */
    private TaxService1 taxService;

/*
construtor com argumentos - nota associado com a interface e
nao com a classe BrazilTaxService

falando um pouco de :
Inversão de controle, Injeção de dependência por meio de construtor
neste modelo temos:
 • Acoplamento fraco
 • A classe RentalService não conhece a dependência concreta
 • Se a classe concreta mudar, a classe RentalService não muda nada

A classe rental service depende da interface e nao da classe concreta.

A interface tx service é um tipo mais generico e o BrzilTaxService concreto
quem esta instanciando a classe concreta é o programa principal via upcasting
chama-se : Injeção de dependência por meio de construtor

A nao injecao de depedencia causaria o problema similar ao exemplo  anterior
com acoplamento forte.
Um exemplo disso seria ao inves de receber o objeto TaxService1 dentro dos
parametros do construtor, mas dentro da instancia.
eg.
this.taxService = new BrazilTaxService.
Isso faz com q a classe RentalService seja responsavel por instanciar o Brazil
TaxService.

 */

    public RentalService1(Double pricePerDay, Double pricePerHour, TaxService1 taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }


/*
metodo para processar invoice recebendo um car rental como argumento
vamos pro toda a logica para calculo por dia e horas
No java a data é armazanada em milisegundos

 */
    public void processInvoice(CarRental1 carRental1) {
        /*
        criando uma variavel para cada data
        o get.time pega a data em milesegundos
         */
        long t1 = carRental1.getStart().getTime();
        long t2 = carRental1.getFinish().getTime();
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

        carRental1.setInvoice(new Invoice(basicPayment, tax));

    }
}
