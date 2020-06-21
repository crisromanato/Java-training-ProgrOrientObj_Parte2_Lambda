package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Map.Case2_Sem_Equals_Hashcode.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.Map.Case2_Sem_Equals_Hashcode.entities.ProductMap;

import java.util.HashMap;
import java.util.Map;

/*

Demo 2 - imagine que queremos fazer um Map de produto e estoque
Product e double

Neste caso, como nao existe hashcode ele usa a comparacao de ponteiros
e com isso da falso no contains.

 */
public class Case2_Product_Estoque {
    public static void main (String[] args) {

        Map<ProductMap, Double> stock = new HashMap<> ();

        ProductMap p1 = new ProductMap ("Tv", 900.0);
        ProductMap p2 = new ProductMap ("Notebook", 1200.0);
        ProductMap p3 = new ProductMap ("Tablet", 400.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 15000.0);

        ProductMap ps = new ProductMap ("Tv", 900.0);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }

    }

