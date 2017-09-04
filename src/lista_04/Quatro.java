/* Inverter uma String */
package lista_04;

import java.util.Scanner;

public class Quatro {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        String s, result;
        int i;

        System.out.printf("Informe uma string: ");
        s = ler.nextLine();

        result = "";

        for (i = (s.length() - 1) ; i >= 0; i--){
            result = result + s.charAt(i);
        }

        System.out.printf("String invertida: %s", result);
    }
}