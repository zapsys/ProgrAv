/* Tabuada de um número usando o método 'tabuada' */
package Set_11;

import java.util.Scanner;

public class Um {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int n;

        System.out.printf("Informe um número para a tabuada: ");
        n = ler.nextInt();

        System.out.println();

        tabuada(n);
        System.out.printf("%d! = %d\n", n, Geral.fatorial(n));
        System.out.printf("Qtd. de combinações de 6 números 2 a 2: %d\n", Geral.combinacoes(6,2));
    }
    public static void tabuada(int n){
        int i;

        for(i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", n, i, (n*i));
        }
        System.out.println();
    }
}
