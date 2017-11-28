/* Exercício 2: Avaliação do IMC de uma pessoa a partir do método (função) 'interpretarIMC' da classe 'Geral' */

package Set_11;

import java.util.Scanner;

public class Dois {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        double pesoCorporal, altura, vlrIMC;

        System.out.printf("Informe o peso corporal em (kg): ");
        pesoCorporal = ler.nextDouble();

        System.out.println();

        System.out.printf("Altura (em metros): ");
        altura = ler.nextDouble();

        vlrIMC = Geral.imc(pesoCorporal, altura);

        System.out.println();

        System.out.printf("IMC: %.2f (%s)\n", vlrIMC, Geral.interpretarIMC(vlrIMC));
    }
}