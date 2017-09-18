/* Specification here */
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
    }
}