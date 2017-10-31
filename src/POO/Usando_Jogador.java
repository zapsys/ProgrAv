/* Usando a classe 'Jogador.java'com atributos de herança da classe 'Pessoa.java' */
package POO;

public class Usando_Jogador {
    public static void main(String args[]) {
        Jogador x = new Jogador("Juca Bala",'M', new Data(23,10,1969),0,15000.00);
        Jogador y = new Jogador("Aram Zap", 'M', new Data(12,05,1987),3,27000.00);

        System.out.printf(x.toString());
        System.out.println();
        System.out.printf(y.toString());
    }
}