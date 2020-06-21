package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.Cap18_Fixacao.model.services;

public interface OnlinePaymentService {
    double paymentFee(double amount);

    double interest(double amount, int months);
}
