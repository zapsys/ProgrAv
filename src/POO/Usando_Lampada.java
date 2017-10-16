/* Usando a classe 'Lampada' (métodos ligar, desligar e estado) */

package POO;

public class Usando_Lampada {
    public static void main(String args[]) {
        Lampada lamp1 = new Lampada("Quarto", false);
        Lampada lamp2 = new Lampada("Banheiro", true);

        lamp1.estado();
        lamp2.estado();

        System.out.println();

        lamp1.ligar();
        lamp1.estado();

        lamp2.desligar();
        lamp2.estado();

    }
}