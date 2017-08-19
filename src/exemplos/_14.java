/* Uso de passo variárel no laço 'for' */

/** author: Aram Zap
/** data: 13/03/17 */

package exemplos;

import java.util.Scanner;

public class _14 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int inicio, fim, passo;

        System.out.print("Informe o valor da largada: ");
        inicio = ler.nextInt();

        System.out.print("Informe o valor da chegada: ");
        fim = ler.nextInt();

        System.out.print("Informe o valor do passo: ");
        passo = ler.nextInt();

        int i;
        for (i = inicio; i <= fim; i = i + passo) {
            System.out.printf("%d - Alô Mundo!!!\n", i);
        }
    }
}