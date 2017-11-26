
package POO4;

import java.util.ArrayList;


public class Vaquinha {
    private String nome;
    ArrayList<Contribuicao> contribuicoes;

    public Vaquinha(String nome, ArrayList<Contribuicao> contribuicoes) {
        this.nome = nome;
        this.contribuicoes = contribuicoes;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Contribuicao> getContribuicoes() {
        return contribuicoes;
    }

    public void setContribuicoes(ArrayList<Contribuicao> contribuicoes) {
        this.contribuicoes = contribuicoes;
    }

    
    public String maior(){
        double maior;
        int i = 0, idMaior = 0; 
        int EOF = contribuicoes.size();
        maior = contribuicoes.get(0).getValorContribuicao();
        
        while (i < EOF){
            if (contribuicoes.get(i).getValorContribuicao() > maior){
                maior = contribuicoes.get(i).getValorContribuicao();
                idMaior = i;
            }
            i++;
        }
        return("\nMaior contribuição: " + contribuicoes.get(idMaior).getAluno().getNome() + "\n");
    }
    
    public String mostrar(){
        int totalContribuicoes = contribuicoes.size();
        
        return (nome + ":\n\n" + contribuicoes.toString() + "\n\n" + "Total de contribuiçoes: " + totalContribuicoes + "\n\n" + maior());
    }

}
