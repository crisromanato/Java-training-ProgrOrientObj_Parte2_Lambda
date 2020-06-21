package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap17_TrabalhandoArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
Lendo arquivo texto com classes File e Scanner


Classes
• File -Representação abstrata de um arquivo e seu caminho
• https://docs.oracle.com/javase/10/docs/api/java/io/File.html


• Scanner -Leitor de texto (polimorfismo)
• https://docs.oracle.com/javase/10/docs/api/java/util/Scanner.html


• IOException(Exception) - excecao padrao de entrada e saida para leitura
de arquivos. O compilador obriga tratar essa excecao.
• https://docs.oracle.com/javase/10/docs/api/java/io/IOException.html


 */
public class ProgramFileScanner {
    public static void main(String[] args) {
        /*
        objeto do tipo file e instanciado
        a primeira barra mostra o prefixo de caracteres especiais
        como \n, \t  etc. e a segunda barra é a separacao normal
        dos paths.

        o file vai encapsular tanto os dados como o path.
        temos varias operacoes a partir do file, como canread,etc.
        teste usando file.
         */
        File file = new File("C:\\temp\\in.txt");
        /*
        iniciar uma variavel scanner sc com null
         */
        Scanner sc = null;
        /*
        vou instanciar o scanner a partir do arquivo
        como pode ocorrer uma excecao, tenho q colocar um try
        para tratar a possivel IOException.
         */
        try {
            sc = new Scanner(file);
            /*
            para testar se ainda existe uma linha nova no arquivo
             */
            while (sc.hasNextLine()) {
                /*
                se existir vai pedir pra imprimir a nextline.
                 */
                System.out.println(sc.nextLine());
            }
            /*
            se eu colocar o encerramento do scanner aqui , só que
            se der algum erro de abertura ou leitura do arquivo
            o bloco try vai ser cortado e vai cair no catch
            e o scanner nao vai ser fechado.
            por isso usamos o bloco finally após o catch pra fechar
            o scanner.
             */
            // sc.close();
        }
        catch (IOException e) {
            /*
            getMessage é a msg padrao do java.
             */
            System.out.println("Error: " + e.getMessage());
        }
        /*
        boa pratica para fechar o recurso independente se deu certo o
        try ou nao.
         */
        finally {
            /*
            pode ser q de erro quando o scanner for instanciado
            se isso acontecer temos q tratar antes de fechar, por
            isso checamos se o scanner é dif de null.

            Se eu nao colocar o if abaixo vai dar um nullPointException
            caso de erro no scanner antes de iniciar.
             */
            if (sc != null) {
                sc.close();
            }
        }
    }

    }

