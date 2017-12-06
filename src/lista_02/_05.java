/* Exercício 5: Leitura de cinco números informando se a maioria é par ou ímpar */

/* author: Aram Zap */
/*  date: 20/03/17  */

package lista_02;

import java.util.Scanner;

public class _05 {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int i, num, par = 0, imp = 0;

        for (i = 1; i <= 5; i++){
            System.out.printf("Informe o %do valor: ", i, "\n");
            num = ler.nextInt();

            if (num % 2 == 0)
                par = par + 1;
            else
                imp = imp + 1;

        }
        System.out.println();

        System.out.printf("Resultados ....................................\n");
        System.out.printf("Quantidade de pares = %d\n", par);
        System.out.printf("Quantidade de ímpares = %d\n", imp);

        System.out.println();

        if (par > imp)
            System.out.printf("A maioria dos números informados são PARES.\n");
        else
            System.out.printf("A maioria dos números informados são ÍMPARES.\n");
    }
}