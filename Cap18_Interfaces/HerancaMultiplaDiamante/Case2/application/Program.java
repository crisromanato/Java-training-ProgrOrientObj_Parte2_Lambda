package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.HerancaMultiplaDiamante.Case2.application;


import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.HerancaMultiplaDiamante.Case2.devices.ComboDevice;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.HerancaMultiplaDiamante.Case2.devices.ConcretePrinter;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap18_Interfaces.HerancaMultiplaDiamante.Case2.devices.ConcreteScanner;
/*

Herança múltipla e o problema do diamante

ATENÇÃO:
Isso NÃO é herança múltipla, pois NÃO HÁ REUSO na relação entre ComboDevice
e as interfaces Scanner e Printer.
ComboDevide não herda, mas sim implementa as interfaces (cumpreocontrato).

No coneito classico onde as interfaces nao tem metodos concretos nao se trata
de heranca multipla.
Não existe reuso.

Quando tiver metodo concreto dentro da interface ai sim teremos heranca multipla.

https://github.com/acenelio/interfaces3-java
 */

public class Program {

	public static void main(String[] args) {

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");

		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
	}
}
