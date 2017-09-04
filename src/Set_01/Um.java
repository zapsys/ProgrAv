/* Imprimindo strings com laço 'for' */
package Set_01;

public class Um {
    public static void main(String args[]) {
        char c;

        for(c = 'A'; c <= 'Z'; c++){
            System.out.printf("%c",c);
        }

        System.out.println();

        for (c = 'A'; c <= 'H'; c++){
            System.out.printf("%d - %c\n", (int)c, c);
        }
        System.out.println();
    }
}