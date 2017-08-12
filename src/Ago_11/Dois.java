/* Avalia se um número inteiro é positivo, negativo ou zero */
package Ago_11;

import java.util.Scanner;

public class Dois {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int n;

        System.out.printf("Informe um número inteiro: ");
        n = ler.nextInt();

        if (n < 0)
            System.out.print("negativo\n");
        else if (n == 0)
            System.out.printf("zero\n");
        else
            System.out.printf("positivo\n");
    }
}