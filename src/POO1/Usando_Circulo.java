/* Uso de métodos definidos em 'Circulo.java' a partir da instanciação do objeto 'x'  */

package POO1;

import java.util.Scanner;

public class Usando_Circulo {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        double raio;

        System.out.printf("Informe o valor do raio: ");
        raio = ler.nextDouble();

        Circulo x = new Circulo(raio);

        System.out.println();

        System.out.printf("Área do círculo: %.2f\n", x.area());
        System.out.printf("Perímetro do círculo: %.2f\n", x.perimetro());
        System.out.printf("Diametro do círculo: %.2f\n", x.diametro());
        System.out.printf("Volume do círculo: %.2f\n", x.volume());


    }
}