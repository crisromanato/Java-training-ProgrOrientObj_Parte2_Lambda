package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Set.CaseTestIgualdade.Case1_SemHashcodeEquals.entities.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Set.CaseTestIgualdade.Case1_SemHashcodeEquals.entities.ProductSet1;

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

eg. abaixo usando os ponteiros.
 */
public class Program4_TestIgualdade {
    public static void main (String[] args) {
/*
criei um set de product e add 3 produtos
 */
        Set<ProductSet1> set = new HashSet<> ();
        set.add (new ProductSet1 ("TV", 900.0));
        set.add (new ProductSet1 ("Notebook", 1200.0));
        set.add (new ProductSet1 ("Tablet", 400.0));
/*
instanciei um prod informando o notebook
 */

        ProductSet1 prod = new ProductSet1 ("Notebook", 1200.0);
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

