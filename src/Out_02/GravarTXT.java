/* Imprimir tabuada para um arquivo (pasta temporária 'tmp' do linux) */

package Out_02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GravarTXT {
    public static void main(String args[]) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n;

        System.out.printf("Informe um número inteiro: ");
        n = ler.nextInt();


        System.out.println();

        FileWriter arq = new FileWriter("//tmp//Tabuada.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        for (int i = 1; i <= 10; i++){
            gravarArq.printf("%d x %2d = %d\n", n, i, (n * i));
        }
        gravarArq.close();
    }
}