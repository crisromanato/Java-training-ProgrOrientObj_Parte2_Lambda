package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.HerancaMultiplaDiamante.Case2.devices;
/*
podemos falar que a classe ConcreteScanner herda (extends) Device
e implements (interface)  Scanner
podemos dizer que nossa classe ConcreteScanner é um Device e também uma
 Scanner
 Ele sobrescreve as operacoes que vieram do device e do scanner.
 */
public class ConcreteScanner extends Device implements Scanner {

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}

	@Override
	public String scan() {
		return "Scanned content";
	}
}
