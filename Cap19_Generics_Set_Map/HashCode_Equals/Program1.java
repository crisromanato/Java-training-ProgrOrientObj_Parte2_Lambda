package ProgramacaoOrientadaObjetos_Parte2_Lambda.HashCode_Equals;
/*
hashCode e equals

hashCodee equals
• São operações da classe Object utilizadas para comparar se um objeto é
igual a outro

• equals:lento,resposta100%
• hashCode:rápido,porém resposta positiva não é 100%

• Tipos comuns (String, Date, Integer, Double, etc.) já possuem
implementação para essas operações.
Classes personalizadas precisam sobrepô-las.

 */
public class Program1 {
    public static void main (String[] args) {

        /*
        Equals
           Método que compara se o objeto é igual a outro, retornando true
           ou false.
         */
                String a = "Maria";
                String b = "Alex";
        System.out.println ("Resultado para equals: " + (a.equals(b)));

        /*
        HashCode
Método que retorna um número inteiro representando um código gerado
 a partir das informações do objeto
*/

 String a1 = "Maria";
 String b1 = "Alex";
        System.out.println ("Resultado para dois Hascodes Maria e Alex: ");
System.out.println(a1.hashCode());
System.out.println(b1.hashCode());


/*
Regra de ouro do HashCode

• Se o hashCodede dois objetos for diferente, então os dois objetos
são diferentes
• Se o código de dois objetos for igual, muito provavelmente os objetos
são iguais
(pode haver colisão) - Devido aa hascode ser limitado a 32bits
muito dificil de acontecer pois o numero inteiro cabe 4bilhoes de
possibilidades

 */
        String a2 = "Maria";
        String b2 = "Maria";
        System.out.println ("Resultado para dois Hascodes Maria e Maria: ");
        System.out.println(a2.hashCode());
        System.out.println(b2.hashCode());

/*
o Hashcode é muito rapido
Normalmente se usa o hashcode para compara enquanto o resultado for numeros
diferentes, quando der um resultado de valores iguais, entao, usa-se o equals
para fazer a verificacao e validar somente o objeto cujo igualdade foi
encontrado no hashcode.

 */
    }
}
