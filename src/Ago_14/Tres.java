/* Exercício 3: Estrutura de repetição com a estrutura 'while' */

package Ago_14;

public class Tres {
    public static void main(String args[]) {
        System.out.printf("\nUsando o comando \"while\":\n");

        int i;

        i = 1;
        while (i <= 10){
            System.out.printf("%d\n", i);
            i++;
        }

        System.out.println();

        i = 5;
        while (i <= 50){
            System.out.printf("%d\n", i);
            i = i + 5;
        }

        System.out.println();

        i = 10;
        while (i >= 1){
            System.out.printf("%d\n", i);
            i = i - 1;
        }

        System.out.println();
    }
}