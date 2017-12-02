/* Exemplo 3: Operações entre dois números inteiros */

/** author: Aram Zap */
/** date: 07/03/2017 */

package exemplos;

import java.util.Scanner;

public class _03{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        int a,b;

        System.out.print("Informe o primeiro numero: ");
        a = ler.nextInt();

        System.out.print("Informe o segundo numero: ");
        b = ler.nextInt();

        System.out.println();

        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d x %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b); /* divisão inteira */
        System.out.printf("%d / %d = %f\n", a, b, a /(double) b); /* divisão real usando 'type casting' */
    }
}