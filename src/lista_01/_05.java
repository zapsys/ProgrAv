/** author: Aram Zap */
/** date: 10/03/2017 */

package lista_01;

import java.util.Scanner;

public class _05 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int a, b;

        System.out.printf("Entre com o 1o. valor: ");
        a = ler.nextInt();

        System.out.printf("Entre com o 2o. valor: ");
        b = ler.nextInt();

        if (a < b)
            System.out.printf("%d é menor que %d\n", a, b);
        else if (a == b)
            System.out.printf("%d é igual a %d\n", a, b);
        else
            System.out.printf("%d é maior que %d\n", a, b);
    }
}