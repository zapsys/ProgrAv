/* Números ímpares de 0 a 20 */

/** author: Aram Zap
 *  date: 20/03/17  */

package lista_02;

public class _01 {
    public static void main(String args[]) {
        int i;
        for (i = 0; i <= 20; i++){
            if (i % 2 != 0)
                System.out.printf("%d\n",i);
        }
    }
}