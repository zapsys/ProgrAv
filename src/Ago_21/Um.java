/* Operações básicas com funções do método Math */
package Ago_21;


public class Um {
    public static void main(String args[]) {

        System.out.printf("Número PI = %.7f\n\n", Math.PI);

        System.out.printf("Raiz quadrada de 11 = %.6f\n\n", Math.sqrt(11));

        System.out.printf("2 elevado a 4 = %.0f\n\n", Math.pow(2,4));

        int n;

        for(int i = 1; i < 7; i++){
            n = (int)(Math.random()*100);
            System.out.printf("%d número aleatório = %d\n\n", i, n);
        }
    }
}