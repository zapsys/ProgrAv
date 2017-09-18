/* Imprimir elementos e operações de dois vetores a partir da classe 'GeralVetor' */
package Set_18;

public class Usando_GeralVetor {

    public static void main(String args[]) {

        int a[] = new int[8];
        int b[] = new int[5];

        GeralVetor.alimentar(a);
        GeralVetor.imprimir(a);

        System.out.println();

        GeralVetor.alimentar(b);
        GeralVetor.imprimir(b);
        System.out.printf("Soma = %d\n", GeralVetor.somar(b));
        System.out.printf("Média = %.2f\n", GeralVetor.media(b));
        System.out.printf("Qtd. de pares = %d\n", GeralVetor.contarPares(b));
    }
}