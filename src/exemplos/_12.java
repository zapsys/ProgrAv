/* Exemplo 12: Cálculo do fatorial de 'n' usando a estrutura de repetição 'for' */

/** author: Aram Zap */
/** date: 13/03/2017 */

package exemplos;

import java.util.Scanner;

public class _12 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int n;

        System.out.print("Informe um valor inteiro: ");
        n = ler.nextInt();

        int i, f = 1;
        for (i = n; i >= 1; i--) {
            f = f * i;
        }
        System.out.printf("\n%d! = %d\n", n, f);
    }
}