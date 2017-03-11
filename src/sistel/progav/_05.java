/** author: Aram Zap */
/** date: 10/03/2017 */

package sistel.progav;

import java.util.Scanner;

public class _05 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        int num;

        System.out.printf("Entre com um numero inteiro: ");
        num = ler.nextInt();

        if (num > 0) {                                              // if simples
            System.out.printf("%d eh positivo.\n", num);
        }
        if ((num % 2) == 0)                                         // if na forma composta
            System.out.printf("%d eh par.", num);
        else
            System.out.printf("%d eh impar.", num);

    }
}
