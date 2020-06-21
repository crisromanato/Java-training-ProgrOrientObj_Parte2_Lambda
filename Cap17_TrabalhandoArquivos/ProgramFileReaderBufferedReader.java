package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap17_TrabalhandoArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader e BufferedReader (PROCESSO MANUAL)

Classes
• FileReader(streamde leitura de caracteres a partir de arquivos)
stream é uma sequencia.
Vou estabelecer uma sequencai de leitura a partir de um arquivo.
A medida q for precisando eu vou navegando na stream.
• https://docs.oracle.com/javase/10/docs/api/java/io/FileReader.html

• BufferedReader(mais rápido)
Ele é instanciado a partir do filereader e implementa algumas otimizacoes
usando o buffer de memoria.
• https://docs.oracle.com/javase/10/docs/api/java/io/BufferedReader.html

• https://stackoverflow.com/questions/9648811/specific-difference-betweenbufferedreader-and-filereader


 */
public class ProgramFileReaderBufferedReader {
    public static void main(String[] args) {
        /*
        variavel string com o caminho
        neste exemplo é manual.
         */
        String path = "C:\\temp\\ina.txt";
        FileReader fr = null;
        BufferedReader br = null;

        /*
        bloco try pra tentar abrir o aqruivo
         */
        try {
            /*
            vou instanciar uma variavel fr e como
            argumento vou por o caminho do arquivo
            estabelecendo uma stream.
             */
            fr = new FileReader(path);
            /*
            instanciando o br buscando o fr e tornando
            a leitura mais rapida.
            Ele é uma abstracao maior

            Pode ser assim também:
            br = new BufferedReader(new FileReader(path));

            Mas no nosso exemplo vamos deixar detalhado.
             */
            br = new BufferedReader(fr);

            /*
            variavel para ler a linha do arquivo,
            se o arquivo estiver no final o readline
            vai retornar nullo, por isso
            vamos fazer um while para que ao terminar seja
            impresso os dados.
             */
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                /*
                em seguida ler a proxima linha
                 */
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            /*
            para fechar as duas streams
             */
        } finally
                /*
                colocamos um try dentro do finally q fecha
                o filereader e o bufferedreader pq se ocorrer
                algum erro precisamos ver a IOException
                e caso tambem uma printStackTrace para ver em
                detalhe o erro.
                 */
        {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    }
