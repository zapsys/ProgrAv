/* Exemplo 6: Exemplo avaliação valor lógico 'e' */

/** author: Aram Zap */
/** date: 10/03/2017 */

package exemplos;

import java.util.Scanner;

public class _06 {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int num;

        System.out.printf("Entre com um numero inteiro: ");
        num = ler.nextInt();

        System.out.println();

        if ((num >= 5) && (num <= 20))
            System.out.printf("%d pertence ao intervalo [5,20]", num);
        else
            System.out.printf("%d nao pertence ao intervalo [5,20]", num);
    }
}
