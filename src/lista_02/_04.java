/** Divisores de um número inteiro **/

/* author: Aram Zap */
/*  date: 20/03/17  */

package lista_02;

import java.util.Scanner;

public class _04 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int n;

        System.out.printf("Entre com um número: ");
        n = ler.nextInt();

        System.out.print("\nDivisores: ");

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}