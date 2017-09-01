/* Specification here */
package Set_01;

import java.util.Scanner;

public class Tres {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        String s;
        int i;

        System.out.printf("Informe uma string:\n");
        s = ler.nextLine();

        System.out.println();

        for (i = 0; i < s.length(); i++) {
            System.out.printf("s[%d] = %c\n", i, s.charAt(i));
        }
    }
}