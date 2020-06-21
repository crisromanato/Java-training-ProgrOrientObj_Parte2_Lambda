package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.HerancaMultiplaDiamante.Case2.devices;
/*
podemos falar que a classe ComboDevice herda (extends) Device
e implements (interface)  Scanner e Printer
podemos dizer que nossa classe ComboDevice é um Device e também um
 Scanner e printer
 Ele sobrescreve as operacoes que vieram da print, scanner e  device.
 */
public class ComboDevice extends Device implements Scanner, Printer {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}
/*
estabelecer o contrato e elimina a ambiguidade do diamante.
 */
	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
	}

	@Override
	public String scan() {
		return "Combo scan result";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
	}
}
