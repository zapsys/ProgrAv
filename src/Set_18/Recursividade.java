/* Classe 'Recursividade' que implementa o método 'fatorial' */
package Set_18;

public class Recursividade {

    public static int fatorial(int n){
        if (n == 0)
            return(1);
        else
            return(n*fatorial(n-1));
    }
    public static void mostrarVetor(int v[], int i){
        if(i != v.length) {
            System.out.printf("[%d] = %d\n", i, v[i]);
            i++;
            mostrarVetor(v, i);
        }
    }
}
