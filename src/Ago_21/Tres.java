/* Exercício 3: Armazenagem de resultados em vetores */

package Ago_21;

import java.util.Scanner;

public class Tres {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int i;
        int n = 5;
        int a[] = new int[n];
        int b[] = new int[n];
        double c[] = new double[n];

        for (i = 0; i < n; i++){
            System.out.printf("Informe o %do valor de %d: ", (i + 1), n);
            a[i] = ler.nextInt();
        }

        for (i = 0; i < n; i++){
            b[i] = (int)Math.pow(a[i], 2);
            c[i] = Math.sqrt(a[i]);
        }

        System.out.println();

        System.out.printf("   a[i]    |      (a[i])²    |  sqrt(a[i])     \n");
        System.out.printf("-----------------------------------------------\n");
        for(i = 0; i < n; i++){
            System.out.printf("a[%d] = %3d      b[%d] = %3d     c[%d] = %.2f\n", i, a[i], i, b[i], i, c[i]);
        }





        System.out.println();



    }
}