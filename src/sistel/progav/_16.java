/* Exponenciação de um número (base 'b') no exponente 'n' */

/** author: Aram Zap
/** date: 13/03/17 */

package sistel.progav;

import java.util.Scanner;

public class _16 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int b, n;

        System.out.print("Entre com um número (base): ");
        b = ler.nextInt();

        System.out.print("Entre com o expoente: ");
        n = ler.nextInt();

        int exp = 1, count = 0;
        while(count < n) {
            exp = exp * b;
            count =  count + 1;
        }
        System.out.printf("%d^%d = %d", b, n, exp);
    }
}