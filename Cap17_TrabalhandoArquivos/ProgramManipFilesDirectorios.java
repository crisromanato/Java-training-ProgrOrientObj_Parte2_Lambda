package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap17_TrabalhandoArquivos;

import java.io.File;
import java.util.Scanner;

/*
Manipulando pastas com File


 */
public class ProgramManipFilesDirectorios {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
/*
usuario vai digitar um caminho que vai ser salvo na string
 */
        System.out.println("Enter a folder path: eg. C:\\temp ");
        String strPath = sc.nextLine();
/*
criamos uma variavel path e vamos instanciar o caminho
q foi digitado
Uma variavel do tipo file pode ser tanto um caminho de um
arquivo quanto o caminho de uma pasta
 */
        File path = new File(strPath);
/*
gerar uma listagem de todas as pastas do c:temp
vamos criar um vetor de files e vamos instanciar
com um .listFiles e dentro do argumento vamos colocar
uma funcao q especifica q tipo de file queremos (exp lambda)
similar ao que fizemos com os predicados.
 */
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        /*
        vamos fazer um laco for eache pra imprimir a lista
         */
                for (File folder : folders) {
            System.out.println(folder);

        }
        System.out.println();
                /*
                agora sera a impressao dos arquivos
                 */
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }
        System.out.println();
        /*
        criar uma subpasta a partir do diretorio q informarmos.
        o comando .mkdir criar a pasta
         */
        boolean success = new File(strPath + "\\subdir").mkdir();

        System.out.print("Directory created successfully: " + success);

        sc.close();
    }

}
