/* Uso de métodos implementados na classe java 'Quadrado' */

package lista_06;

import java.util.Scanner;

public class Usa_Quadrado {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int lado;

        System.out.printf("Entre com o lado do quadrado: ");
        lado = ler.nextInt();

        System.out.println();

        System.out.printf("Área do  quadrado: %.2f\n\n", Quadrado.area(lado));
        System.out.printf("Perímetro do  quadrado: %.2f\n\n", Quadrado.perimetro(lado));
        System.out.printf("Diagonal do  quadrado: %.2f\n\n", Quadrado.diagonal(lado));

    }
}