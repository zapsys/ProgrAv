/* Tabuada de um número (sem usar 'for') */

/** author: Aram Zap */
/** date: 07/03/2017 */

package sistel.progav;

import java.util.Scanner;

public class _04{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        int n;

        System.out.print("Informe um numero inteiro: ");
        n = ler.nextInt();

        System.out.println();

        System.out.printf("Tabuada de %d: ", n);

        System.out.println();

        System.out.printf("%d x 1 = %d\n", n, n * 1);
        System.out.printf("%d x 2 = %d\n", n, n * 2);
        System.out.printf("%d x 3 = %d\n", n, n * 3);
        System.out.printf("%d x 4 = %d\n", n, n * 4);
        System.out.printf("%d x 5 = %d\n", n, n * 5);
        System.out.printf("%d x 6 = %d\n", n, n * 6);
        System.out.printf("%d x 7 = %d\n", n, n * 7);
        System.out.printf("%d x 8 = %d\n", n, n * 8);
        System.out.printf("%d x 9 = %d\n", n, n * 9);
        System.out.printf("%d x 10 = %d\n", n, n * 10);
    }
}