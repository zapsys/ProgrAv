package POO;

public class Jogador extends Pessoa{
    private int posicao;
    private double salario;

    public Jogador(String nome, char sexo, Data dtNasc, int posicao, double salario) {
        super(nome, sexo, dtNasc);
        this.posicao = posicao;
        this.salario = salario;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String nomePosicao(){
        String posicoes[] = {"Goleiro", "Zagueiro","Lateral","Meia", "Atacante"};

        return(posicoes[posicao]);
    }
    @Override
    public String toString() {
        String result;

        result = String.format("%s; %c; %s (%d anos); %s; R$ %.2f",
                getNome(),
                getSexo(),
                getDtNasc().mostrarData(1),
                getDtNasc().calculaIdade(),
                nomePosicao(),
                salario);
        return (result);
    }
}
