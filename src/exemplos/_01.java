/* Exemplo 1: Cálculo do quadrado e cubo de um número inteiro */

/** author: Aram Zap */
/** date: 07/03/2017 */

package exemplos;

import java.util.Scanner;

public class _01 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int num, quad, cub;

        System.out.println("Informe um numero inteiro: ");
        num = ler.nextInt();

        quad = num * num;
        cub = num * num * num;

        System.out.println();

        System.out.printf("%d x %d = %d\n", num, num, quad);
        System.out.printf("%d x %d x %d = %d\n", num, num, num, cub);
    }
}
