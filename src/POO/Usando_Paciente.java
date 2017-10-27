/* Usando a classe filha 'Paciente' a partir da instanciação do objeto 'x' e 'y' */
package POO;

public class Usando_Paciente {
    public static void main(String args[]) {
        Paciente x = new Paciente("Juca Bala", 'M', new Data(16, 2 , 1990),82.750, 1.77);
        Paciente y = new Paciente("Lucas Forte", 'M', new Data(5, 8 , 1993),66.000, 1.87);

        System.out.println(x.toString());
        System.out.println("---------------------------------");
        System.out.println(y.toString());
    }
}