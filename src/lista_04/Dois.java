/* Exercício 2: Verifica se uma string possui algarismos numéricos */

package lista_04;

import java.util.Scanner;

public class Dois {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        String s, answer;
        int i;
        boolean check;

        System.out.printf("Informe uma string: ");
        s = ler.nextLine();

        check = false;

        i = 0;

        while ((i < s.length()) && (check == false)){
            if ((s.charAt(i) >= '0') && (s.charAt(i) <= '9'))
                check = true;
            else
                i++;
        }
        if (check == true)
            answer = "A string possui caracteres numéricos";
        else
            answer = "A string não possui caracteres numéricos";
        System.out.println();
        System.out.printf("%s", answer);
    }
}