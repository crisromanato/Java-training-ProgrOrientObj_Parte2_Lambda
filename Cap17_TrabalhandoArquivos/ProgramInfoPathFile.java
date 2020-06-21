package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap17_TrabalhandoArquivos;

import java.io.File;
import java.util.Scanner;

/*
Informações do caminho do arquivo


 */
public class ProgramInfoPathFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: eg. : c:\\temp\\in.txt " + "\n");
        /*
        guardar da variavel
         */
        String strPath = sc.nextLine();
        /*
        variavel para receber o path
         */
        File path = new File(strPath);
        /*
        suponha q quero acessar somente o nome do arquivo
        impressoes do path,
         */
        System.out.println();
        System.out.println("getName: " + path.getName() + "\n");
        /*
        outros exemplos de operacoes .get para files.
        eg. caminho inteiro
         */

        System.out.println("getPath : " + path.getPath() + "\n");
        /*
        para o caminho somente
         */
        System.out.println("getParent : " + path.getParent() + "\n");

        sc.close();
    }

}
