/* ArrayList de pessoas usando a classe 'Pessoa.java' e 'Data.java' */

package Nov_06;

import POO.Data;
import POO.Pessoa;

import java.util.ArrayList;

public class Um {
    public static void main(String[] args){
        ArrayList<Pessoa> pessoas = new ArrayList();

        pessoas.add(new Pessoa("X",'M', new Data(14, 2, 1985)));

        pessoas.add(new Pessoa("Y", 'F', new Data(10,8, 2000)));

        pessoas.add(new Pessoa("Z", 'F', new Data(3, 1, 1984)));

        for (Pessoa item: pessoas){
            System.out.printf("%s\n\n", item.toString());
        }
    }
}
