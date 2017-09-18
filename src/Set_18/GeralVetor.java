/* Clase 'GeralVetor'que implementa diversos métodos de operações com vetores */

package Set_18;

public class GeralVetor {
    public static void alimentar(int v[]){
        for(int i = 0; i < v.length; i++){
            v[i] = (int)(Math.random()*100);
        }
    }
    public static void imprimir(int v[]){
        for(int i = 0; i < v.length; i++){
            System.out.printf("[%d] = %d\n", i, v[i]);
        }
    }
    public static int somar(int v[]){
        int result = 0;
        for(int i = 0; i < v.length; i++){
            result = result + v[i];
        }
        return(result);
    }
    public static double media(int v[]){
        return(somar(v)/(double)v.length);
    }
    public static int contarPares(int v[]){
        int result = 0;
        for(int i = 0; i < v.length; i++){
            if (v[i] % 2 == 0)
            result = result + 1;
        }
        return(result);
    }

}
