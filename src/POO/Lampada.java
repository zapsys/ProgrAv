/* Classe abstrata 'Lampada' com atributos de nome (local) e estado (ligada / desligada) */

package POO;

public class Lampada {
    private final String nome;
    private boolean ligada;

    public Lampada(String nome, boolean ligada) {
        this.nome = nome;
        this.ligada = ligada;
    }

    public void ligar(){
        ligada = true;
    }

    public  void desligar(){
        ligada = false;
    }

    public void estado(){
        if (ligada == true)
            System.out.printf("%s, está ligada\n", nome);
        else
            System.out.printf("%s, está desligada\n", nome);


    }
}
