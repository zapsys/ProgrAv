/* Instanciando ArrayList da classe 'Pontuacao.java' e objeto da classe 'Eleicao.java' */

package POO5;

import java.util.ArrayList;


public class Usando_Eleicao {
    public static void main(String[] args) {
        ArrayList<Pontuacao> pontuacoes = new ArrayList<Pontuacao>();
        Eleicao eleicao = new Eleicao("Eleicão The Best: ", pontuacoes);
        
        eleicao.adicionar(new Pontuacao(new Aluno("Zap",30,"Aram Zap"),5.50));
        eleicao.adicionar(new Pontuacao(new Aluno("Santos",34,"Tony Santos"),4.50));
        eleicao.adicionar(new Pontuacao(new Aluno("Oliveira",34,"Bruno"),6.60));
        eleicao.adicionar(new Pontuacao(new Aluno("dos Passos",23,"Jennifer"),1.50));
        eleicao.adicionar(new Pontuacao(new Aluno("Souza",33,"Fernanda"),6.60));
       
               
        System.out.println();
       
        eleicao.mostrar();       
    }
}
