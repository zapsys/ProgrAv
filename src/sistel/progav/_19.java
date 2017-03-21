/* Vetores: Conjunto de valores a[i] e seus quadrados b[i] com 7 elementos */

/** author: Aram Zap
 *  date: 20/03/17  */

package sistel.progav;

import java.util.Scanner;

public class _19 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int i, n = 7;
        int a[] = new int[n];
        int b[] = new int[n];

        for (i = 0; i < n; i++){
            System.out.printf("Informe o %do número de %d: ", (i + 1), n);
            a[i] = ler.nextInt();
            b[i] = (int)Math.pow(a[i], 2);
        }

        System.out.println();

        for (i = 0; i < n; i++){
            System.out.printf("a[%d] = %d , b[%d] = %d\n", i, a[i], i, b[i]);
        }

    }
}