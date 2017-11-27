
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

    public void adicionar(Contribuicao novaContribuicao){
        contribuicoes.add(novaContribuicao);
    }
    
    public Aluno maior(){
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
        return(contribuicoes.get(idMaior).getAluno());
    }
    
    public void mostrar(){
        double totalContribuicoes = 0;
        
        for (Contribuicao item : contribuicoes){
            totalContribuicoes = totalContribuicoes + item.getValorContribuicao();
        }
        
        System.out.print(nome + ":");
        System.out.println();
        System.out.println();
        System.out.printf(contribuicoes.toString());
        System.out.println();
        System.out.println();
        System.out.printf("Total de contribuiçoes: R$ %.2f",totalContribuicoes);
        System.out.println();
        System.out.printf("Maior contribuição: %s\n", maior().getNome());
                
    }

}
