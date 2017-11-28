/* Exercício 3: Operações com armazenagem de resultados em vetores */

package lista_03;

import java.util.Scanner;

public class Tres {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int i;
        int n = 7;
        int A[] = new int[n];
        double B[] = new double[n];

        for (i = 0; i < n; i++){
            System.out.printf("Informe o %do valor de %d: ", (i + 1), n);
            A[i] = ler.nextInt();
        }

        for (i = 0; i < n; i++){
            B[i] = Math.sqrt(A[i]);
        }

        System.out.println();

        System.out.printf("   A[i]    |   sqrt(A[i])     \n");
        System.out.printf("------------------------------\n");
        for(i = 0; i < n; i++){
            System.out.printf("A[%d] = %3d      B[%d] = %3f\n", i, A[i], i, B[i]);
        }

        System.out.println();
    }
}
