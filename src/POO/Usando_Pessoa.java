/* Specification here */
package POO;

public class Usando_Pessoa {
    public static void main(String args[]) {
        Pessoa x = new Pessoa("Juca Bala",'M', new Data(16,2,1990));
        Pessoa y = new Pessoa("Maria Aparecida", 'F', new Data(25, 9, 1956));

        System.out.printf("%s\n", x.toString());
        System.out.printf("%s\n", y.toString());

    }
}