/* Usando a classe 'Colaborador.java'com atributos de herança da classe 'Pessoa.java' */
package POO;

public class Usando_Colaborador {
    public static void main(String args[]) {
        Colaborador x = new Colaborador("Juca Bala",'M', new Data(23,10,1969),5,1500.00);
        Colaborador y = new Colaborador("Maria Barbosa", 'F', new Data(12,05,1987),3,1300.00);

        System.out.printf(x.toString());
        System.out.println();
        System.out.printf(y.toString());

    }
}