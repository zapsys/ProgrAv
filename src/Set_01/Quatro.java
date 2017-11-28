/* Exercício 4: Representação triangular de uma 'String' (varredura) */

package Set_01;

import java.util.Scanner;

public class Quatro {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        String s;
        int i, j;

        System.out.printf("Informe uma string: \n");
        s = ler.nextLine();

        for (i = 0; i < s.length(); i++){
            for(j = 0; j <= i; j++){
                System.out.printf("%c ", s.charAt(j));
            }
            System.out.println();
        }
    }
}