/* Vetores: Ler 5 números, armazenar em um vetor e mostá-los na tela */

/** author: Aram Zap
 *  date: 20/03/17  */

package sistel.progav;

import java.util.Scanner;

public class _18 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int i, n = 5;

        int v[] = new int[5];

        for (i = 0; i < 5; i++){
            System.out.printf("Informe o %do elemento de %d: ", (i + 1), n);
            v[i] = ler.nextInt();
        }
        System.out.println();

        for (i = 0; i < n; i++){
            System.out.printf("v[%d] = %d\n", i, v[i]);
        }
    }
}