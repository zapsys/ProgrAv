/* Classe java 'Eleicao' com agregação do objeto 'pontuacoes' do tipo 'Pontuacoes' em um ArrayList  */

package POO5;

import java.util.ArrayList;


public class Eleicao {
    private String nomeEleicao;
    private ArrayList<Pontuacao> pontuacoes;

    public Eleicao(String nomeEleicao) {
        this.nomeEleicao = nomeEleicao;
        this.pontuacoes = new ArrayList();
    }

    public String getNomeEleicao() {
        return nomeEleicao;
    }

    public void setNomeEleicao(String nomeEleicao) {
        this.nomeEleicao = nomeEleicao;
    }

    public ArrayList<Pontuacao> getPontuacoes() {
        return pontuacoes;
    }

    public void setPontuacoes(ArrayList<Pontuacao> pontuacoes) {
        this.pontuacoes = pontuacoes;
    }
   
    public void adicionar(Pontuacao novaPontuacao){
        pontuacoes.add(novaPontuacao);
    }
        
    public Aluno maior(){
        double maiorPontuacao;
        int maiorIdade = 0, idMaior = 0; 
        int tamanho = pontuacoes.size();
        maiorPontuacao = pontuacoes.get(0).getPontos();
        
        for (int i = 1; i < tamanho; i++){
                if (pontuacoes.get(i).getPontos() > maiorPontuacao){
                    maiorPontuacao = pontuacoes.get(i).getPontos();
                    maiorIdade = pontuacoes.get(i).getAluno().getIdade();
                    idMaior = i;
                }
                else if (pontuacoes.get(i).getPontos() == pontuacoes.get(i).getPontos()){
                    if (maiorIdade < pontuacoes.get(i).getAluno().getIdade()){
                        idMaior = i;
                    }
                }
        }
        return(pontuacoes.get(idMaior).getAluno());
    }
    public double media(){
        double somaPontuacoes = 0;
        int numeroPontuacoes;
        
        numeroPontuacoes = pontuacoes.size();
        
        for (Pontuacao item : pontuacoes){
            somaPontuacoes = somaPontuacoes + item.getPontos();
        }
        return(somaPontuacoes/numeroPontuacoes);
    }
    public void mostrar(){
               
        System.out.printf("%s\n", nomeEleicao);
        System.out.println();
        for (Pontuacao item : pontuacoes){
            System.out.println(item.toString());
        }
        System.out.printf("\nThe Best: %s\n", maior().getNomePessoa() + " " + maior().getSobrenome());
        System.out.printf("\nMedia de pontos: %.2f\n",media());
   }
}
