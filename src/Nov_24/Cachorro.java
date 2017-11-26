/* Classe 'Cachorro.java' que extende a classe abstrata 'Animal.java' */

package Nov_24;

public class Cachorro extends Animal {
    public static int ct = 0;
    
    public Cachorro(String nome){
        super(nome);
        ct = ct + 1;
    }

    @Override
    public void som() {
        System.out.println("Au, Au, Au, Au!");
    }
    public void rosnar(){
        System.out.println("grrrrrrrrrrrrrrr!");
        System.out.print("\n-----------------------------\n");
    }
    
    @Override
    public String toString(){
        return "Cachorro(" + getNome() + ')';
    }
}
