/* Classe java 'Pontuacao' com associação do objeto 'aluno' do tipo 'Aluno' */

package POO5;


public class Pontuacao {
    private Aluno aluno;
    private double pontos;

    public Pontuacao(Aluno aluno, double pontos) {
        this.aluno = aluno;
        this.pontos = pontos;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    @Override
    public String toString() {
        return (aluno.getNomePessoa()  + " (" + aluno.getSobrenome() + "), " + String.format("%.2f", pontos) + " ");
    }
    
    
}
