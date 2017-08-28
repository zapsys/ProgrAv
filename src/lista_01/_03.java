/* author: Aram Zap */
/* date: 17/08/2017 */

package lista_01;

import java.util.Scanner;

public class _03 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.printf("Entre com a idade da pessoa: ");
        idade = ler.nextInt();

        if ((idade >= 0) && (idade <= 2))
            System.out.print("\nRecém-nascido");
        else if ((idade >= 3) && (idade <= 11))
            System.out.print("\nCriança");
        else if ((idade >= 12) && (idade <= 19))
            System.out.print("\nAdolescente");
        else if ((idade >= 20) && (idade <= 55))
            System.out.print("\nAdulto");
        else if (idade > 55)
            System.out.print("\nIdoso");
        else if  (idade < 0)
            System.out.print("\nIdade inválida");
    }
}
