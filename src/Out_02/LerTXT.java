/* Ler um arquivo de texto a partir de seu caminho */

package Out_02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LerTXT {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        Scanner ler = new Scanner(System.in);

        String nomeArq;

        System.out.printf("Informe o nome do arquivo para ser lido: ");
        nomeArq = ler.nextLine();

        FileReader arq = new FileReader(nomeArq);
        BufferedReader lerArq = new BufferedReader(arq);

        System.out.println("\nConteúdo do arquivo lido:");

        String linha;

        linha = lerArq.readLine(); // lê a primeira linha

        while (linha != null){
            System.out.printf("%s\n", linha);
            linha = lerArq.readLine(); // lê da segunda até a última linha (EOF)
        }
        lerArq.close();
    }
}