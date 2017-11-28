/* Exercício 4: Laço de repetição 'for' (Passo positivo e passo negativo) */

package Ago_14;

public class Quatro {
    public static void main(String args[]) {
        System.out.printf("\nUsando o comando \"for\":\n");

        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d\n", i);
        }

        System.out.println();

        for (int i = 5; i <= 50; i = i + 5)
        {
            System.out.printf("%d\n", i);
        }

        System.out.println();

        for (int i = 10; i >= 1; i--)
        {
            System.out.printf("%d\n", i);
        }

    }
}