package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Set.CaseTestIgualdade.Case2_ComHashcodeEquals.application;


import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Set.CaseTestIgualdade.Case2_ComHashcodeEquals.entities.Product5_TestIgualdade;

import java.util.HashSet;
import java.util.Set;

/*
Como Set testa igualdade?

Como as coleções Hash testam igualdade?
• Se hashCode e equals estiverem implementados:
    • Primeiro hashCode. Se der igual, usa equals para confirmar.

• Lembre-se: String, Integer, Double, etc. já possuem equals e hashCode

• Se hashCode e equals NÃO estiverem implementados:
    • Compara as referências (ponteiros) dos objetos.

   eg. abaixo usando hashCode e equals na classe product.
 */
public class Program5_TestIgualdade {
    public static void main (String[] args) {
/*
criei um set de product e add 3 produtos
 */
        Set<Product5_TestIgualdade> set = new HashSet<> ();
        set.add (new Product5_TestIgualdade ("TV", 900.0));
        set.add (new Product5_TestIgualdade ("Notebook", 1200.0));
        set.add (new Product5_TestIgualdade ("Tablet", 400.0));
/*
instanciei um prod informando o notebook
 */

        Product5_TestIgualdade prod = new Product5_TestIgualdade ("Notebook", 1200.0);
/*
agora vou checar se o set product contain o notebbok que eu instanciei
note que vai dar falso porque o programa comparou o produto instanciado
com o produto do set e como sao ponteiros diferentes ele considera que
nao sao iguais.
 */
        System.out.println(set.contains(prod));
/*
como comparar entao por conteudo?
Posso implementar as operacoes hashcode e equals na classe product.

 */
    }

}

