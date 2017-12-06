/* Exercício 2: Leitura de 5 números inteiros e apresentação dos negativos */

/* author: Aram Zap */
/*  date: 20/03/17  */

package lista_02;

import java.util.Scanner;

public class _02 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int n, count = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Entre com o %do valor: ", i);
            n = ler.nextInt();

            if (n < 0) {
                count = count + 1;
            }
        }
        System.out.printf("\nQte de negativos = %d", count);
    }
}