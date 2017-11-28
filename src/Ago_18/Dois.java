/* Exercício 2: Fatorial de um número inteiro positivo */

package Ago_18;

import java.util.Scanner;

public class Dois {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int i, n, fatorial;

        System.out.printf("Informe um número inteiro positivo: ");
        n = ler.nextInt();

        fatorial = 1;

        for(i = 1; i <=n; i++){
            fatorial = fatorial*i;
        }

        System.out.printf("%d! = %d\n", n, fatorial);

    }
}