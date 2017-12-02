/* Exemplo 7: Avaliação de inteiro com valor lógico 'ou' */

/** author: Aram Zap */
/** date: 10/03/2017 */

package exemplos;

import java.util.Scanner;

public class _07 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        int num;

        System.out.printf("Entre com um numero inteiro: ");
        num = ler.nextInt();

        if ((num == 5) || (num == 20)){
            if (num == 5)
                System.out.printf("cinco");
            else
                System.out.printf("vinte");
        }
    }
}
