/* Exercício 1: Contagem de números negativos informados */

package Ago_18;

import java.util.Scanner;

public class Um {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int i, n, soma = 0, contneg = 0;

        for (i = 1; i <= 5; i++){
            System.out.printf("Entre com %do valor: ", i);
            n = ler.nextInt();

            soma = soma + n;

            if (n < 0)
                contneg = contneg + 1;
        }
        System.out.println();
        System.out.printf("Soma = %d\n", soma);
        System.out.printf("Foram informados %d números negativos.\n", contneg);
    }
}