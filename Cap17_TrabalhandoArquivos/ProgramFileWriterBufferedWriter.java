package ProgramacaoOrientadaObjetos_Parte2_Lambda.Cap17_TrabalhandoArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
FileWriter e BufferedWriter

Do mesmo jeito que temos o FileReader e o BufferedReader temos
FileWriter e BufferedWriter

Classes
• FileWriter(stream (sequencia) de escrita de caracteres em de arquivos)
• https://docs.oracle.com/javase/10/docs/api/java/io/FileWriter.html

• Cria/recria-sobrepoe) o arquivo: new FileWriter(path)
• Acrescenta no final ao arquivo existente: new FileWriter(path, true)


• BufferedWriter(mais rápido)
• https://docs.oracle.com/javase/10/docs/api/java/io/BufferedWriter.html

 */
public class ProgramFileWriterBufferedWriter {
    public static void main(String[] args) {
        /*
        vetor de strings instanciado
         */
        String[] lines = new String[] {
                "Good morning", "Good afternoon", "Good night" };
        /*
        criar e gravar num local
         */
        String path = "C:\\temp\\out.txt";

        /*
        bloco try instanciado

        se add o parametro true ele nao vai recriar mas add
         */

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            /*
             logica pra gravar os dados.
             */
            for (String line : lines) {
                bw.write(line);
                /*
                quebra de linha no bufferedwriter
                 */
                bw.newLine();

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
