/* Exercício 4: Vetor de 10 posições construído com números aleatórios */

package Ago_21;


public class Quatro {
    public static void main(String args[]) {

        int i;
        int n = 10;
        int valor[] = new int[n];

        for(i = 0; i < n; i++){
            valor[i] = (int)(Math.random()*100);
        }

        int soma = 0;
        int ctPar = 0;

        for(i = 0; i < n; i++){
            System.out.printf("vetor[%d] = %d\n", i, valor[i]);
            soma = soma + valor[i];
            if (valor[i] % 2 == 0)
                ctPar = ctPar + 1;
        }

        System.out.printf("Soma = %d\n", soma);
        System.out.printf("Qtd de pares = %d\n", ctPar);

    }
}