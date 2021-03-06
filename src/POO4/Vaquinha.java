/* Classe java 'Vaquinha' */

package POO4;

import java.util.ArrayList;


public class Vaquinha {
    private String nome;
    ArrayList<Contribuicao> contribuicoes;

    public Vaquinha(String nome) {
        this.nome = nome;
        this.contribuicoes = new ArrayList();
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
        int tamanho = contribuicoes.size();
        maior = contribuicoes.get(0).getValorContribuicao();
                
        while (i < tamanho){
            if (contribuicoes.get(i).getValorContribuicao() > maior){
                maior = contribuicoes.get(i).getValorContribuicao();
                idMaior = i;
            }
            i++;
        }
        return(contribuicoes.get(idMaior).getAluno());
    }
    
    /* Métdo mais elegante */
    /*
    public Aluno maior(){
        Contribuicao result = new Contribuicao(new Aluno("","",""),0);
        
        for (Contribuicao item: contribuicoes){
            
            if (result.getValorContribuicao() < item.getValorContribuicao())
                result = item;
            }
        return(result.getAluno());
    }
    */
    
    public void mostrar(){
        double totalContribuicoes = 0;
        
        for (Contribuicao item : contribuicoes){
            totalContribuicoes = totalContribuicoes + item.getValorContribuicao();
        }
        
        System.out.print(nome + ":");
        System.out.println();
        System.out.println();
        for (Contribuicao item : contribuicoes){
            System.out.printf("%s\n",item.toString());
        }
        System.out.println();
        System.out.printf("Total de contribuiçoes: R$ %.2f",totalContribuicoes);
        System.out.println();
        System.out.println();
        System.out.printf("Maior contribuição: %s\n", maior().getNome());           
    }
}
