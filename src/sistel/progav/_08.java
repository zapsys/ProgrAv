/* Exemplo avaliação valor maior/menor e diferença entre maior e menor */

/** author: Aram Zap */
/** date: 10/03/2017 */

package sistel.progav;

import java.util.Scanner;

public class _08 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int a, b, dif;

        System.out.printf("Informe o 1o. valor: ");
        a = ler.nextInt();

        System.out.printf("Informe o 2o. valor: ");
        b = ler.nextInt();

        if (a >= b) {
            dif = a - b;
            System.out.printf("\n%d - %d = %d\n", a, b, dif);
        }
        else {
            dif = b - a;
            System.out.printf("\n%d - %d = %d\n", b, a, dif);
        }
    }
}
