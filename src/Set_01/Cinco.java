/* Exercício 5: Contagem de caracteres maiúsculos, minúsculos e letras 'A' de uma 'String' */

package Set_01;


import java.util.Scanner;

public class Cinco {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        String s;
        int i, ctMaius, ctMinus, ctA;

        System.out.printf("Informe uma string: ");
        s = ler.nextLine();

        ctMaius = 0;
        ctMinus = 0;
        ctA     = 0;

        for (i = 0; i < s.length(); i++){
            if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))

                ctMaius = ctMaius + 1;

            if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))

                ctMinus = ctMinus + 1;

            if ((s.charAt(i) == 'A') || (s.charAt(i) == 'a'))

                ctA = ctA + 1;
        }
        System.out.printf("\nMaiúsculas = %d", ctMaius);
        System.out.printf("\nMinúsculas = %d", ctMinus);
        System.out.printf("\nLetras 'A' = %d\n", ctA);

    }
}