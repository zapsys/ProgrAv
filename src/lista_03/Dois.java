/* Soma dos valores inteiros compreendidos entre A e B */

package lista_03;

import java.util.Scanner;

public class Dois {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        int A, B, i;
        int count = 0, soma = 0;


        System.out.printf("Informe o valor do 1º inteiro: ");
        A = ler.nextInt();

        System.out.printf("\nInforme o valor do 2º inteiro: ");
        B = ler.nextInt();



        for (i = A; i <= B; i++) {
            count = count + 1;        //contagem da qtd de valores compreendidos entre A e B
        }

        int valor[] = new int[count]; //atribuição do tamanho do vetor

        int j = A;
        for (i = 0; i < count; i++) {
            valor[i] = j;
            soma = soma + valor[i];
            j++;
        }
        System.out.println();

        System.out.printf("Soma = %d\n", soma);
    }
}

