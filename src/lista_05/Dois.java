/* Cálculo de propriedades do círculo a partir da classe 'Circulo' */
package lista_05;

import java.util.Scanner;

public class Dois {
    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);

        double r;

        System.out.printf("Inform o raio do círculo: ");
        r = ler.nextDouble();

        System.out.printf("\nÁrea do círculo: %.2f\n", Circulo.area(r));
        System.out.printf("\nPerímetro do círculo: %.2f\n", Circulo.perimetro(r));
        System.out.printf("\nDiâmetro do círculo: %.2f\n", Circulo.diametro(r));
        System.out.printf("\nVolume do círculo: %.2f\n", Circulo.volume(r));
    }
}