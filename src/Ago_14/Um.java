/* Exercício 1: Comparação de valores usando 'if' */

package Ago_14;

import java.util.Scanner;

public class Um {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int n;

        System.out.printf("Entre com um número: ");
        n = ler.nextInt();

        if ((n >= 0) && (n <= 10)) {
            System.out.printf("O número %d pertence ao intervalo [0,10]\n", n);
        }
        if ((n == 5) || (n == 10)) {
            System.out.printf("O número é %d.\n", n);
        }
        if (n == -5) {
            System.out.printf("O número %d é negativo.\n", n);
        }
    }
}