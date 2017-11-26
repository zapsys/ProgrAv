
package POO4;


public class Contribuicao{
    private Aluno aluno;
    private double valorContribuicao;

    public Contribuicao(Aluno aluno, double valorContribuicao) {
        this.aluno = aluno;
        this.valorContribuicao = valorContribuicao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public double getValorContribuicao() {
        return valorContribuicao;
    }

    public void setValorContribuicao(double valorContribuicao) {
        this.valorContribuicao = valorContribuicao;
    }
        
    @Override
    public String toString() {
        return (aluno.getNome()  + " (" + aluno.getApelido() + "), " + String.format("R$ %.2f", valorContribuicao) + "\n");
    }

    

    
    

}
