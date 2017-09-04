/* Substitui as letras 'A' ou 'a' de uma string por '*' */
package lista_04;

import java.util.Scanner;

public class Tres {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        String s, result;
        int i;


        System.out.printf("Entre com uma string: ");
        s = ler.nextLine();

        result = "";

        for (i = 0; i < s.length(); i++){
            if ((s.charAt(i) == 'A') || (s.charAt(i) == 'a'))
               result = result + "*";
            else
                result = result + s.charAt(i);
        }
        System.out.println();
        System.out.printf("Frase original: %s\n\n", s);
        System.out.printf("Frase alterada: %s", result);
    }
}