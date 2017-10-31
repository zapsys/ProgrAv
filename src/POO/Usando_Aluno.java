/* Usando a classe 'Aluno.java'com atributos de herança da classe 'Pessoa.java' */
package POO;

public class Usando_Aluno {
    public static void main(String args[]) {
        Aluno x = new Aluno("Maurício dos Santos", 'M', new Data(23, 12, 1995),6,110,7.5,4.5);
        Aluno y = new Aluno("Karla da Silva", 'F', new Data(07, 8, 1999),28,110,5.5,4.2);

        System.out.print(x.toString());
        System.out.println();
        System.out.print(y.toString());

    }
}