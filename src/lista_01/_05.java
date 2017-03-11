/** author: Aram Zap */
/** date: 10/03/2017 */

package lista_01;

import java.util.Scanner;

public class _05 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int idade;

        System.out.printf("Entre com a idade da pessoa: ");
        idade = ler.nextInt();

        if ((idade >= 0) && (idade <= 2))
            System.out.print("Recém-nascido");
        else if ((idade >= 3) && (idade <= 11))
            System.out.print("Criança");
        else if ((idade >= 12) && (idade <= 19))
            System.out.print("Adolescente");
        else if ((idade >= 20) && (idade <= 55))
            System.out.print("Adulto");
        else if (idade > 55)
            System.out.print("Idoso");
        else if (idade < 0)
            System.out.print("Idade inválida");
    }
}
