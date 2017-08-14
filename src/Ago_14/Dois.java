/* Diferença de dois números reais */
package Ago_14;

import java.util.Scanner;

public class Dois {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

            double a, b, dif;

            System.out.printf("a: ");
            a = ler.nextDouble();

            System.out.printf("b: ");
            b = ler.nextDouble();

            if (a >= b) {
                dif = a - b;
                System.out.printf("\n%.2f - %.2f = %.2f", a, b, dif);
            }
            else{
                    dif = b - a;
                    System.out.printf("\n%.2f - %.2f = %.2f", b, a, dif);
                }
    }
}