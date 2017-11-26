/* Usando a classe 'Colaborador.java' através da instanciação de um ArrayList */

package POO;

import java.util.ArrayList;

public class Usando_Colaborador_1 {
    public static void main(String args[]) {
        ArrayList<Colaborador> colaborador = new ArrayList<Colaborador>();

        colaborador.add(new Colaborador("Maria da Silva", 'F', new Data(14, 2, 1989), 5, 1700.00));
        colaborador.add(new Colaborador("Fernando Gusmão", 'M', new Data(26, 9, 1958), 0, 3200.00));
        colaborador.add(new Colaborador("Marieta Severo", 'F', new Data(8, 4, 1969), 10, 1830.00));
        colaborador.add(new Colaborador("Juliano Ferreira", 'M', new Data(30, 7, 1984), 2, 2200.00));

        for (Colaborador item: colaborador){
            System.out.println(item.toString());
        }
    }
}