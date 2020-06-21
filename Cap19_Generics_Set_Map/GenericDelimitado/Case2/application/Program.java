package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.GenericDelimitado.Case2.application;

import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.GenericDelimitado.Case2.entities.ProductCap19GenDel2;
import ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap19_Generics_Set_Map.GenericDelimitado.Case2.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
/*
adaptar a lista para produtos
 */
        List<ProductCap19GenDel2> list = new ArrayList<>();
        String                    path = "C:\\temp\\in4.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                /*
                recordar cada parte do texto
                 */
                String[] fields = line.split(",");
                /*
                add produtos com conversao do campo price
                 */
                list.add (new ProductCap19GenDel2 (fields[0], Double.parseDouble (fields[1])));
                line = br.readLine();
            }

/*
declarar um product x que recebe um calculation
 */

            ProductCap19GenDel2 x = CalculationService.max (list);
            System.out.println("Most expensive:");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
