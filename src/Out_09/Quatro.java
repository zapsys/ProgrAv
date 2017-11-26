/* Trabalhando com o ArrayList de números inteiros 'Integer' */

package Out_09;


import java.util.ArrayList;

public class Quatro {
    public static void main(String args[]) {
        ArrayList<Integer> x = new ArrayList();

        int i, n;

        n = (int)(Math.random()*20);

        for(i = 0; i < n; i++){
            x.add((int)(Math.random()*100));
        }

        int soma = 0;

        for(i = 0; i < n; i++){
            System.out.printf("[%d] = %d\n", i, x.get(i));
            soma = soma + x.get(i);
        }
        System.out.printf("Soma = %d\n", soma);
    }
}