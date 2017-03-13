/* Cálculo da soma de 5 valores usando a estrutura de repetição 'for' */

/** author: Aram Zap */
/** date: 13/03/2017 */

package sistel.progav;

import java.util.Scanner;

public class _13 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int n, soma = 0;

        for (int i = 1; i <= 5; i++){
            System.out.printf("Entre com o %do número: ", i);
            n = ler.nextInt();

            soma = soma + n; // ou soma += n;
        }
        System.out.printf("\nSoma = %d", soma);
    }
}