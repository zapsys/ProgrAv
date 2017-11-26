/* Tratamento de exceções 1: 'InputMismatchException' e 'ArithmeticException' */

package Out_09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Um {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int a, b;

        try {
            System.out.print("Informe o 1o valor: ");
            a = ler.nextInt();

            System.out.println();

            System.out.print("Informe o 2o valor: ");
            b = ler.nextInt();

            System.out.printf("\n%d / %d = %d\n", a, b, divisaoInteira(a, b));
        } catch (InputMismatchException erro) {
            System.out.printf("Erro: " + erro);
        }
    }

    public static int divisaoInteira(int a, int b) {
        try {
            return (a/b);
        }
        catch (ArithmeticException erro) {
            System.out.printf("Erro: " + erro);
            return(0);
        }
    }
}