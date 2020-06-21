    package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Set;

    import java.util.HashSet;
    import java.util.LinkedHashSet;
    import java.util.Set;
    import java.util.TreeSet;

    /*
    Set<T> - tipo generico também igual list
    • Representa um conjunto de elementos (similar ao da Álgebra)
        • Não admite repetições
        • Elementos não possuem posição - pode existir ordem
        • Acesso, inserção e remoção de elementos são rápidos
        • Oferece operações eficientes de conjunto:
            interseção, união, diferença.
        • Principais implementações:
            • HashSet-mais rápido (operações O(1) em tabela hash) e não ordenado
            • TreeSet-mais lento (operações O(log(n)) em árvore rubro-negra) e
                ordenado pelo compareTodo objeto (ou Comparator)
            • LinkedHashSet-velocidade intermediária e elementos na ordem em
                que são adicionados

    • https://docs.oracle.com/javase/10/docs/api/java/util/Set.html

    Alguns métodos importantes
    • add(obj), remove(obj), contains(obj) - verificar se o obj existe
        • Baseado em equals e hashCode
        • Se equals e hashCode não existir, é usada comparação de ponteiros

        • clear() • size() • removeIf(predicate)

    • addAll(other) -união: adiciona no conjunto os elementos do outro conjunto,
        sem repetição
    • retainAll(other) -interseção: remove do conjunto os elementos não contito
        sem other
    • removeAll(other) -diferença: remove do conjunto os elementos contidos em other


     */
    public class Program1_Implement {
        public static void main (String[] args) {

            Set<String> set = new HashSet<> ();
/*
add 3 elementos num set
 */
            set.add("TV");
            set.add("Tablet");
            set.add("Notebook");


            /*
            testar se notebook exist no set.
             */
            System.out.print ("Test se exist Notebook no set: ");
            System.out.println ("Impressao via Hashset - sem ordem definida");
            System.out.println(set.contains("Notebook"));
  /*
            impressao
             */
            for (String p : set) {
                System.out.println(p);
            }
            System.out.println ("----------------------");

            Set<String> set1 = new TreeSet<> ();
/*
add 3 elementos num set
 */
            set1.add("Tv");
            set1.add("Tablet");
            set1.add("Notebook");

            /*
            testar se notebook exist no set.
             */
            System.out.print ("Test se exist Notebook no set1: ");
            System.out.println ("Impressao via Treeset - ordem definida");
            System.out.println(set.contains("Notebook"));
  /*
            impressao
             */
            for (String p1 : set1) {
                System.out.println(p1);
            }
            System.out.println ("----------------------");

            Set<String> set2 = new LinkedHashSet<> ();
/*
add 3 elementos num set
 */
            set2.add("Tv");
            set2.add("Tablet");
            set2.add("Notebook");

            set2.removeIf (x -> x.charAt (0) == 'T');
            /*
            testar se notebook exist no set.
             */
            System.out.print ("Test se exist Notebook no set2: ");
            System.out.println ("Impressao via LinkedHashSet - na ordem que foram " +
                                "adicionados");
            System.out.println(set.contains("Notebook"));
  /*
            impressao
             */
            for (String p2 : set2) {
                System.out.println(p2);
            }
        }
        }

