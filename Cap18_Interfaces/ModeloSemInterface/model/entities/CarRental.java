package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.ModeloSemInterface.model.entities;

import java.util.Date;

public class CarRental {
/*
atributos
estamos usando o tipo Wrapper pq
estamos assumindo que se tivermos valor nulo o wrapper vai
tratar e esta padronizado com o banco de dados
 */

    private Date start;
    private Date finish;
    private Vehicle vehicle;
    private Invoice invoice;

/*
construtor padrao
 */

    public CarRental() {
    }

/*
construtor com argumento
 */

    public CarRental(Date start, Date finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

/*
getters(return) and setters(this)
 */

    public Date getStart() {
        return start;
    }
    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }
    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;

    }
}
