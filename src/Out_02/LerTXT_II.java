/* Ler um arquivo de texto a partir de seu caminho e separar string com o método 'split' */

package Out_02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerTXT_II {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        FileReader arq = new FileReader("//home//aram//Temp//amigos.txt");
        BufferedReader lerArq = new BufferedReader(arq);

        String linha;
        String partes[];

        linha = lerArq.readLine(); // lê a primeira linha

        while (linha != null){
            partes = linha.split(";");
            System.out.printf("Nome.: %s\n", partes[0]);
            System.out.printf("Sexo.: %s\n", partes[1]);
            System.out.printf("Idade.: %s\n\n", partes[2]);
            linha = lerArq.readLine(); // lê da segunda até a última linha (EOF)
        }

        lerArq.close();
    }
}