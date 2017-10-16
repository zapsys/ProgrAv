/* Introdução à programação orientada a objetos (16/10/2017) */
package POO;

import java.util.Scanner;

public class Usando_Dados {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        Dados x = new Dados();

        System.out.printf("Informe o 1o. valor: ");
        x.a = ler.nextInt();

        System.out.printf("Informe o 2o. valor: ");
        x.b = ler.nextInt();

        System.out.println();

        System.out.printf("%d + %d = %d\n", x.a, x.b, x.adicao());
        System.out.printf("%d - %d = %d\n", x.a, x.b, x.subtracao());
        System.out.printf("%d * %d = %d\n", x.a, x.b, x.multiplicacao());
        System.out.printf("%d / %d = %d\n", x.a, x.b, x.divisaoInteira());
        System.out.printf("%d / %d = %.2f\n", x.a, x.b, x.divisaoReal());
    }
}