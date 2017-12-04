/* Instanciando o objeto 'eleicao' para adicionar pontuações de alunos */

package POO5;


public class Usando_Eleicao {
    public static void main(String[] args) {
        Eleicao eleicao = new Eleicao("Eleicão The Best: ");
        
        eleicao.adicionar(new Pontuacao(new Aluno("Zap",30,"Aram Zap"),5.50));
        eleicao.adicionar(new Pontuacao(new Aluno("Santos",34,"Tony Santos"),4.50));
        eleicao.adicionar(new Pontuacao(new Aluno("Oliveira",31,"Bruno"),6.60));
        eleicao.adicionar(new Pontuacao(new Aluno("dos Passos",23,"Jennifer"),1.50));
        eleicao.adicionar(new Pontuacao(new Aluno("Souza",33,"Fernanda"),6.60));
       
               
        System.out.println();
       
        eleicao.mostrar();       
    }
}
