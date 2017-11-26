/* */
package Nov_24;

public class Gato extends Animal {
    public static int ct = 0;
    
    public Gato(String nome){
        super(nome);
        ct = ct + 1;
    }

    @Override
    public void som() {
        System.out.println("Miau, miau, miau, miau!");
        System.out.print("\n-----------------------------\n");
    }
    
    @Override
    public String toString(){
        return "Gato(" + getNome() + ')';
    }
}
