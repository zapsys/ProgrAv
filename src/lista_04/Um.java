/* Exercício 1: Contagem de letras maiúsculas de uma String */

package lista_04;

import java.util.Scanner;

public class Um {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        String s;
        int i;
        int contMai = 0;

        System.out.printf("Entre com uma string: ");
        s = ler.nextLine();

        for (i = 0; i < s.length(); i++){
            if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))
                contMai = contMai + 1;
        }
        System.out.println();
        System.out.printf("Qtd de caracteres maiúsculos: %d", contMai);
    }
}