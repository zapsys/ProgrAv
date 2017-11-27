package POO2;

public class Colaborador extends Pessoa {
    private int faltasMes;
    private double salario;

    public Colaborador(String nome, char sexo, Data dtNasc, int faltasMes, double salario) {
        super(nome, sexo, dtNasc);
        this.faltasMes = faltasMes;
        this.salario = salario;
    }

    public int getFaltasMes() {
        return faltasMes;
    }

    public void setFaltasMes(int faltasMes) {
        this.faltasMes = faltasMes;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double valorPremio(){
        switch (faltasMes) {
            case 0:
                return (200.00);
            case 1:
                return (100.00);
            case 2:
                return (100.00);
            case 3:
                return(50.00);
            case 4:
                return(50.00);
            default:
                return(0.00);
        }
    }
    public double salarioFinal(){
        return (salario + valorPremio());
    }

    @Override
    public String toString() {
        String result;

        result = String.format("Nome: %s\nSexo: %c\nNascimento: %s\nIdade: %d (anos)\nFaltas (mês): %d\nSalário: %.2f\nPrêmio: R$ %.2f\nSalario Final: R$ %.2f\n",
                getNome(),
                getSexo(),
                getDtNasc().mostrarData(1),
                getDtNasc().calculaIdade(),
                getFaltasMes(),
                salario,
                valorPremio(),
                salarioFinal());
        return result;
    }
}
