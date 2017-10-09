/* Trabalhando com o ArrayList de 'String' */
package Out_09;

import java.util.ArrayList;

public class Tres {
    public static void main(String args[]) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Jucas Bala");
        nomes.add("Maria da Silva");
        nomes.add("Lucas Paquetá");
        nomes.add("Marieta Severo");
        nomes.add(1, "Fora Michel Temer");

        nomes.remove(3);

        int i, n;
        n = nomes.size();

        for(i =0; i < n; i++){
            System.out.printf("Posição %d = %s\n", i, nomes.get(i));
        }
    }
}