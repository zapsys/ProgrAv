/* Exercício 5: Subtração de valores armazenados (aleatórios de 0 - 99) no vetor A dos elementos do vetor B */

package lista_03;

public class Cinco {
    public static void main(String args[]) {

        int i;
        int n = 10;
        int A[] = new int[n];
        int B[] = new int[n];
        int C[] = new int[n];

        for(i = 0; i < n; i++){
            A[i] = (int)(Math.random()*100);
            B[i] = (int)(Math.random()*100);
        }

        System.out.printf("   i  |  A[i]  |  B[i]  |  C[i]  \n");
        System.out.printf("----------------------------------\n");

        for (i = 0; i < n; i++){
            if (A[i] >= B[i]){
                C[i] = A[i] - B[i];
                System.out.printf("%4d	%4d	%6d	%6d " + "     <== A[i] - B[i]\n", i, A[i], B[i], C[i]);
            }
            else {
                C[i] = B[i] - A[i];
                System.out.printf("%4d	%4d	%6d	%6d " + "     <== B[i] - A[i]\n", i, A[i], B[i], C[i]);
            }
        }
    }
}
