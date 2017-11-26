/* */
package Nov_24;

public class Vaca extends Animal {
    public static int ct = 0;
    
    public Vaca(String nome){
        super(nome);
        ct = ct + 1;
    }

    @Override
    public void som() {
        System.out.println("Muuuuuuuuuuuuuu!");
        System.out.print("\n-----------------------------\n");
    }
    
    @Override
    public String toString(){
        return "Vaca(" + getNome() + ')';
    }
}
