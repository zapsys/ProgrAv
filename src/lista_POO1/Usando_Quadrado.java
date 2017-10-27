/* Uso de métodos definidos em 'Quadrado.java' a partir da instanciação do objeto 'q'  */
package lista_POO1;

import java.util.Scanner;

public class Usando_Quadrado {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        double lado;

        System.out.printf("Informe o lado do quadrado: ");
        lado = ler.nextDouble();

        Quadrado q = new Quadrado(lado);

        System.out.println();

        System.out.printf("Área do quadrado: %.2f\n", q.area());
        System.out.printf("Perímetro do quadrado: %.2f\n", q.perimetro());
        System.out.printf("Diagonal do quadrado: %.2f\n", q.diagonal());
    }
}