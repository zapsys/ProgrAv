/* Multiplicação de dois valores através do método de somas sucessivas */

/* author: Aram Zap */
/*  date: 20/03/17  */

package lista_02;

import java.util.Scanner;

public class _03 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int a, b, mul = 0;

        System.out.printf("Informe o 1o valor: ");
        a = ler.nextInt();

        System.out.printf("Informe o 2o valor: ");
        b = ler.nextInt();

        for (int i = 0; i < b; i++){
            mul = mul + a;
        }
        System.out.printf("%d x %d = %d\n", a, b, mul);



    }
}