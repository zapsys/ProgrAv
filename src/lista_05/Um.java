/* Potência de um número a partir do método 'potenciacao' */
package lista_05;

import java.util.Scanner;

public class Um {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int a, b;

        System.out.printf("Informe a base para potenciação: ");
        a = ler.nextInt();


        System.out.printf("\nInforme o expoente: ");
        b = ler.nextInt();

        potenciacao(a,b);

    }
    public static void potenciacao(int a, int b){
        int i, pot = 1;


        for (i = 1; i <= b; i++){
            pot = pot * a;
        }
        System.out.printf("\nO valor de %d^%d = %d\n", a, b, pot);
    }
}