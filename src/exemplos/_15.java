/* Exemplo 15: Uso de passo não inteiro no laço 'for'  */

/** author: Aram Zap
/** date: 13/03/17 */

package exemplos;

public class _15 {
    public static void main(String args[]) {

        for (double i = 0.25; i <= 2.50; i = i + 0.25) {
            System.out.printf("%.2f\n", i);
        }
    }
}