/* Usando a classe 'Recursividade' para imprimir o fatorial de números inteiros e vetores */

package Set_18;

public class Usando_Recursividade {

    public static void main(String args[]) {

        System.out.printf("4! = %d\n", Recursividade.fatorial(4));
        System.out.printf("7! = %d\n", Recursividade.fatorial(7));

        System.out.println();

        int a[] = {7, 4, 3, -1, 0, 9, 8, 2};

        Recursividade.mostrarVetor(a, 0);

    }
}