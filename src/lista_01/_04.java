/** author: Aram Zap */
/** date: 10/03/2017 */

package lista_01;

import java.util.Scanner;

public class _04 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int a, b;

        System.out.printf("Entre com o 1o. valor: ");
        a = ler.nextInt();

        System.out.printf("Entre com o 2o. valor: ");
        b = ler.nextInt();

        if (a == b)
            System.out.printf("%d é igual %d\n", a, b);
        if (a != b)
            System.out.printf("%d é diferente de %d\n", a, b);
        if (a < b)
            System.out.printf("%d é menor do que %d\n", a, b);
        if (a <= b)
            System.out.printf("%d é menor ou igual a %d\n", a, b);
        if (a > b)
            System.out.printf("%d é maior do que %d\n", a, b);
        if (a >= b)
            System.out.printf("%d é maior ou igual a %d\n", a, b);
    }
}
