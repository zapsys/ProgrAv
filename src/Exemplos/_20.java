/* Vetores: Formação de um vetor com 8 números aleatórios e a sua soma */

/** author: Aram Zap
 *  date: 20/03/17  */

package exemplos;

public class _20 {
    public static void main(String args[]) {
        int i, n = 8;
        int v[] = new int[n];

        for (i = 0; i < n; i++){
            v[i] = (int)(Math.random() * 100);
        }

        int soma = 0;
        for (i = 0; i < n; i++){
            soma = soma + v[i];
        }
        for (i = 0; i < n; i++){
            System.out.printf("v[%d] = %d\n", i, v[i]);
        }
        System.out.printf("\nSoma dos elementos do vetor: %d", soma);
    }
}