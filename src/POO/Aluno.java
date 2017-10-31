package POO;

public class Aluno extends Pessoa {
    private int faltas, aulasNoSemestre;
    private double nota1, nota2;

    public Aluno(String nome, char sexo, Data dtNasc, int faltas, int aulasNoSemestre, double nota1, double nota2) {
        super(nome, sexo, dtNasc);
        this.faltas = faltas;
        this.aulasNoSemestre = aulasNoSemestre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getAulasNoSemestre() {
        return aulasNoSemestre;
    }

    public void setAulasNoSemestre(int aulasNoSemestre) {
        this.aulasNoSemestre = aulasNoSemestre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double calcularMedia(){
        return ((nota1 + nota2)/2.0);
    }
    public double calculaFrequencia(){
        return (((aulasNoSemestre - faltas)/(double)aulasNoSemestre)*100);
    }
    public String status() {
        if ((calcularMedia() >= 6.0) && (calculaFrequencia() >= 75))
            return ("Aprovado.");
        else if ((calcularMedia() < 6.0) && (calculaFrequencia() >= 75))
            return ("Reprovado por nota.");
        else if ((calcularMedia() >= 6.0) && (calculaFrequencia() < 75))
            return ("Reprovado por frequência.");
        else
            return ("Reprovado por nota e frequência.");
    }
    @Override
    public String toString() {
        String result;

        result = String.format("Nome: %s\n" + "Faltas: %d (%.2f de freq.)\n" + "Notas: %.1f ; %.1f\n" + "Média: %.1f\n" + "Status: %s\n",
                getNome(),
                getFaltas(),
                calculaFrequencia(),
                getNota1(),
                getNota2(),
                calcularMedia(),
                status());

        return result;
    }
}