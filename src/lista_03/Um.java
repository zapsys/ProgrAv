/* Exercício 1: Programa que escreve os múltiplos de 7 no intervalo [7,70] e mostra a soma deles */

package lista_03;

public class Um {
    public static void main(String args[]) {

        int i, n = 10;
        int mult7[] = new int[n];
        int soma = 0;

        for (i = 0; i < n; i++) {
            mult7[i] = 7 * (i + 1);
            soma = soma + mult7[i];
        }

        System.out.println();

        for (i = 0; i < n; i++) {
            System.out.printf("mult7[%d] = %d\n", i + 1, mult7[i]);
        }

        System.out.println();

        System.out.printf("Soma = %d\n", soma);
    }
}