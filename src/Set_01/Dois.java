/* Exercício 2: Trabalhando com 'Strings' (entrada pelo teclado) */

package Set_01;

import java.util.Scanner;

public class Dois {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        String s;

        System.out.printf("Informe uma string: ");
        s = ler.nextLine();

        System.out.printf("\nResultados:\n");
        System.out.printf("%s\n", s.toUpperCase());
        System.out.printf("%s\n", s.toLowerCase());
        System.out.printf("Tamanho = %d caracteres\n", s.length());
    }
}