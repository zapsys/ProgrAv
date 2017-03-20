/* Uso de algumas funções da classe 'Math' */

/** author: Aram Zap
 *  date: 20/03/17  */

package sistel.progav;

public class _17 {
    public static void main(String args[]) {
        System.out.printf("PI = %.6f\n", Math.PI);

        System.out.printf("Raiz quadrada de 5 = %.5f\n", Math.sqrt(5));

        System.out.printf("2 elevado a 4 é igual a %.0f\n", Math.pow(2,4));

        System.out.println();

        for (int i = 1; i <= 7; i++){
            System.out.printf("%d = %d\n", i , (int)(Math.random() * 100));
        }
    }
}