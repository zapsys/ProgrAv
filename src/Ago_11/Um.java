/* Operações básicas entre dois números inteiros */

package Ago_11;

import java.util.Scanner;


public class Um {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int a, b;

        System.out.printf("Informe o 1o. valor: ");
        a = ler.nextInt();

        System.out.printf("Informe o 2o. valor: ");
        b = ler.nextInt();

        System.out.println();

        System.out.printf("%d + %d = %d\n", a, b, (a+b));
        System.out.printf("%d - %d = %d\n", a, b, (a-b));
        System.out.printf("%d * %d = %d\n", a, b, (a*b));
        System.out.printf("%d / %d = %.2f\n", a, b, (a/(double)(b)));
    }
}