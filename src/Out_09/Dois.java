/* Tratamento de exceções: 'ArrayIndexOutBoundsException' */
package Out_09;

public class Dois {
    public static void main(String args[]) {

        int x[] = {7, 3, 0, -5, -1, 8, 6};

        mostrarItem(x , 0);
        mostrarItem(x , 5);
        mostrarItem(x , 1);

    }
    public static void mostrarItem(int v[], int i){
        System.out.printf("Posição %d = %d\n", i, v[i]);
    }
}