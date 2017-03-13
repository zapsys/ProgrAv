/* Tabuada do número 'n' usando a estrutura de repetição 'for' */

/** author: Aram Zap */
/** date: 13/03/2017 */

package sistel.progav;

import java.util.Scanner;

public class _11 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int i, n;

        System.out.print("Entre com um número: ");
        n = ler.nextInt();

        for (i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", i, n, i*n);
        }
    }
}
