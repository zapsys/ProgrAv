/* Instanciando objeto 'vaquinha' da classe 'Vaquinha.java' */

package POO4;


public class Usando_Vaquinha {
    public static void main(String[] args) {
        Vaquinha vaquinha = new Vaquinha("Vaquinha Natal 2017");
        
        vaquinha.adicionar(new Contribuicao(new Aluno("aranha","aram@hotmail.com","Aram Zap"),8.50));
        vaquinha.adicionar(new Contribuicao(new Aluno("maranha","tony@hotmail.com","Tony Santos"),4.50));
        vaquinha.adicionar(new Contribuicao(new Aluno("fabi","fabi@hotmail.com","Fabíola Amaral"),8.60));
        vaquinha.adicionar(new Contribuicao(new Aluno("loira","paolaloira@hotmail.com","Paola Santos"),1.50));
        vaquinha.adicionar(new Contribuicao(new Aluno("fernandinho","fer85@hotmail.com","Fernando Gonçalves"),2.25));

        System.out.println();
       
        vaquinha.mostrar();       
    }
}
