/* Tabuada de um número */
package Ago_14;

import java.util.Scanner;

public class Cinco {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int n;

        System.out.printf("Entre com um número inteiro: ");
        n = ler.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d * %2d = %d\n", n,i,n*i);
        }

    }
}