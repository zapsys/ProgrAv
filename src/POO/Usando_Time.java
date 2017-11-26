/* Usando a superclasse (ou classe Pai) 'Time.java' */

package POO;

public class Usando_Time {
    public static void main(String args[]) {
        Time x = new Time("Paraná Clube", new Pessoa("Matheus Costa",'M', new Data(3,7,1980)));

        x.adicionarJogadores(new Jogador("Richard",'M', new Data(23, 5, 1991), 0, 17000));
        x.adicionarJogadores(new Jogador("Maidana", 'M', new Data(8,10,1996), 1, 11000));
        x.adicionarJogadores(new Jogador("Renatinho",'M', new Data(7,11,1999), 4, 20000));

        x.mostrarTime();

    }
}