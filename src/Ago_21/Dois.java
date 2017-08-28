/* Entrada de dados em um vetor de 7 posições */
package Ago_21;

import java.util.Scanner;

public class Dois {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int i;
        int n = 7;
        int v[] = new int[n];

        for (i = 0; i < n; i++){
            System.out.printf("Informe o %d valor de %d: ", (i+1),n);
            v[i] = ler.nextInt();
        }

        System.out.println();

        for (i = 0; i < n; i++){
            System.out.printf("v[%d] = %d\n", i, v[i]);
        }

    }
}