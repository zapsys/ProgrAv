package POO;

import Set_11.Geral;

public class Paciente extends Pessoa {
    private double pesoCorporal;
    private double altura;

    public Paciente(String nome, char sexo, Data dtNasc, double pesoCorporal, double altura) {
        super(nome, sexo, dtNasc);
        this.pesoCorporal = pesoCorporal;
        this.altura = altura;
    }

    public double getPesoCorporal() {
        return pesoCorporal;
    }

    public void setPesoCorporal(double pesoCorporal) {
        this.pesoCorporal = pesoCorporal;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String avaliacaoIMC(){
        double vlrIMC;

        vlrIMC = Geral.imc(pesoCorporal, altura);

        return(String.format("IMC......: %.2f (%s)", vlrIMC, Geral.interpretarIMC(vlrIMC)));
    }

    @Override
    public String toString() {
        String result;

        result = super.toString() +
                "\nPeso......: " + pesoCorporal + "Kg\n" +
                "Altura......: " + altura + "m\n" + avaliacaoIMC();

        return result;
    }
}
