/* Instanciando a classe 'Vaquinha.java' e ArrayList da classe 'Contribuicao.java' */

package POO4;

import java.util.ArrayList;


public class Usando_Vaquinha {
    public static void main(String[] args) {
        Vaquinha vaquinha;
        ArrayList<Contribuicao> contribuicoes = new ArrayList<Contribuicao>();
        
        contribuicoes.add(new Contribuicao(new Aluno("aranha","aram@hotmail.com","Aram Zap"),3.50));
        contribuicoes.add(new Contribuicao(new Aluno("maranha","tony@hotmail.com","Tony Santos"),4.50));
        contribuicoes.add(new Contribuicao(new Aluno("fabi","fabi@hotmail.com","Fabíola Amaral"),4.60));
        contribuicoes.add(new Contribuicao(new Aluno("loira","paolaloira@hotmail.com","Paola Santos"),1.50));
        contribuicoes.add(new Contribuicao(new Aluno("fernandinho","fer85@hotmail.com","Fernando Gonçalves"),2.25));
        
        vaquinha = new Vaquinha("Vaquinha Natal 2017", contribuicoes);
               
        System.out.println();
       
        System.out.printf(vaquinha.mostrar());       
    }
}
