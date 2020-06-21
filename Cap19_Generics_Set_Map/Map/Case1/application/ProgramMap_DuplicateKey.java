package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Map.Case1.application;

import java.util.Map;
import java.util.TreeMap;

/*

Map
É uma estrutura de dados generica que possui dois tipos
TIPO CHAVE E TIPO VALOR
O valor sera identifica pelo chave e podem ser de qualquer tipo.


Map<K,V>
• https://docs.oracle.com/javase/10/docs/api/java/util/Map.html


    • É uma coleção de pares chave / valor
        • Não admite repetições do objeto chave
        • Os elementos são indexados pelo objeto chave (não possuem posição)
        • Acesso, inserção e remoção de elementos são rápidos

    • Uso comum: cookies, local storage, qualquer modelo chave-valor

    • Principais implementações: parecidos com o de set
        • HashMap-mais rápido (operações O(1) em tabela hash) e não ordenado
        • TreeMap-mais lento (operações O(log(n)) em árvore rubro-negra) e
            ordenado pelo compareTodo objeto (ou Comparator)
        • LinkedHashMap-velocidade intermediária e elementos na ordem em
            que são adicionados

Alguns métodos importantes
• put(key, value), remove(key), containsKey(key), get(key)
put - inserir elemento numa determinada chave e pode atribuir um valor para essa
chave.
remove - voce passa a chave
containsKey - verifica se existe uma determinada chave
getKey - recupera um elemento pela chave

São: assim como no set baseados em:
    • Baseado em equals e hashCode
    • Se equals e hashCode não existir, é usada comparação de ponteiros

• clear() - limpar o conjunto
• size() - verifica o tamanho

• keySet() -retorna um Set<K> com as chaves contidas no Map
• values() -retorna a um Collection<V> do tipo valor

 */
public class ProgramMap_DuplicateKey {
    public static void main (String[] args) {
/*
vamos armazenar cookies , o tipo da chave e valor serao string.
Como o tipo string ja tem implementado o hashcode e também o compareTo, posso
usar o TreeMap diretamente.
 */
        Map<String, String> cookies = new TreeMap<> ();
/*
add coockies no Map com chave e valor.
 */
        cookies.put ("username", "maria");
        cookies.put ("email", "maria@gmail.com");
        cookies.put ("phone", "99771122");
/*
exemplo de remocao de iten
 */
        cookies.remove ("email");
        /*
        add novo item com mesma chave e valor diferente
        ele vai sobrescrever com o novo valor, pois nao aceita repeticao
         */
        cookies.put ("phone", "99771133");
/*
impressao de cookies
 */
        System.out.println ("ALL COOKIES:");

    /*
    for para percorrer cada string Key q n meu cj de Key chaves cookies.keySet
    No final vai imprimir a chave concatenado com cookies.get(key) ou seja a
    chave.

    Como usamos o TreeMap ele fez também a ordenacao
     */
        for ( String key : cookies.keySet () ) {
            System.out.println (key + ": " + cookies.get (key));
        }
    }}


