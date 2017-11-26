package POO;

import java.util.ArrayList;

public class Time {
    private String nomeTime;
    private Pessoa tecnico;
    private ArrayList<Jogador> jogadores;

    public Time(String nomeTime, Pessoa tecnico) {
        this.nomeTime = nomeTime;
        this.tecnico = tecnico;
        jogadores = new ArrayList();
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public Pessoa getTecnico() {
        return tecnico;
    }

    public void setTecnico(Pessoa tecnico) {
        this.tecnico = tecnico;
    }

    public void adicionarJogadores(Jogador novoJogador){
        jogadores.add(novoJogador);
    }

    public void mostrarTime(){
        System.out.print(" ________________________________________________________\n");
        System.out.print("|                                                        |\n");

        System.out.printf("| %s (Técnico: %s)                  |\n", nomeTime, tecnico.getNome());
        System.out.print("|");
        System.out.print("________________________________________________________|\n\n");

        double totalSalarios = 0;

        System.out.println("Jogadores________________________________________________\n");
        for (Jogador item: jogadores){
            System.out.println(item.toString());
            totalSalarios += item.getSalario();
        }
        System.out.println("_________________________________________________________\n");
        System.out.printf("Salário total = R$ %.2f\n", totalSalarios);
    }
}
