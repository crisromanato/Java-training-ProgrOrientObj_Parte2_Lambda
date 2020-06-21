package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.HerancaMultiplaDiamante.Case2.devices;


/*
podemos falar que a classe ConcretePrinter herda (extends) Device
e implements (interface)  Printer
podemos dizer que nossa classe ConcretePrinter é um Device e também uma
 Printer
 Ela sobrescreve as operacoes que vieram do device e do printer.

 */
public class ConcretePrinter extends Device implements Printer {

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}
}
