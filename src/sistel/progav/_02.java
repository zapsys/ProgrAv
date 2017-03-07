/* Cálculo do resto da divisão por 2 de um número inteiro */

/** author: Aram Zap */
/** date: 07/03/2017 */

package sistel.progav;

import java.util.Scanner;

public class _02{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        int num,resto;

        System.out.println("Informe um numero inteiro: ");
        num = ler.nextInt();

        resto = num % 2;

        System.out.println();

        System.out.printf("%d resto 2 = %d\n", num, resto);
    }
}
