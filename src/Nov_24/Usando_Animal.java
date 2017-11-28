/* Uso da classe abstrata 'Animal.java' através instanciação de animais em um ArrayList */

package Nov_24;

import java.util.ArrayList;

public class Usando_Animal {

    public static void main(String[] args) {
       ArrayList<Animal> animais = new ArrayList();
       
       animais.add(new Cachorro("Rim tim-tim"));
       animais.add(new Gato("Garfield"));
       animais.add(new Vaca("Mimosa"));
       animais.add(new Cachorro("Scooby-Doo"));
       animais.add(new Cachorro("Leslie"));
       animais.add(new Gato("Manda chuva"));       
    
    for(Animal item : animais){
        System.out.println(item.toString());
        item.som();
                
        if (item instanceof Cachorro)
            ((Cachorro)item).rosnar();
        
        System.out.println();
    }
    System.out.printf("Existe(m) : " + Cachorro.ct + " cachorro(s) na lista.\n");
    System.out.printf("Existe(m) : " + Gato.ct + " gato(s) na lista.\n");
    System.out.printf("Existe(m) : " + Vaca.ct + " vaca(s) na lista.\n");
    }
}
