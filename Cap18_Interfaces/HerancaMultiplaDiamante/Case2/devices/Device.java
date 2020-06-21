package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.HerancaMultiplaDiamante.Case2.devices;
/*

 */
public abstract class Device {
/*
atributo definido
 */
	public String serialNumber;

	public Device(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/*
	metodo abstrato process doc
	 */
	public abstract void processDoc(String doc);
}
