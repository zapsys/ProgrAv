/* Polimorfismo de sobrecarga (overload) */
package Set_22;

public class Overload {
    public static int somaSequencia(int fim){
        int i, result = 0;
        for(i = 1; i <= fim; i++){
            System.out.printf("%d, ", i);
            result = result + i;
        }
        return(result);
    }
    public static int somaSequencia(int inicio, int fim, int passo){
        int i, result = 0;
        for(i = inicio; i <= fim; i = i + passo){
            System.out.printf("%d, ", i);
            result = result + i;
        }
        return(result);
    }
}
