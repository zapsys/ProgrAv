/* Verifica se um número inteiro é par e ímpar */

package Ago_11;

import java.util.Scanner;

public class Tres {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int n;

        System.out.print("Entre com um número: ");
        n = ler.nextInt();


        if ((n % 2) == 0)
            System.out.printf("O número %d é par\n", n);
        else
            System.out.printf("O número %d é ímpar\n",n);

    }
}