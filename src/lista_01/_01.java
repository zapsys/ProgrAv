/** author: Aram Zap */
/** date: 10/03/2017 */

package lista_01;

import java.util.Scanner;

public class _01 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int a, b, prod;

        System.out.printf("Entre com o 1o. valor: ");
        a = ler.nextInt();

        System.out.printf("Entre com o 2o. valor: ");
        b = ler.nextInt();

        prod = a * b;

        System.out.println();

        System.out.printf("%d x %d = %d", a, b, prod);

    }
}