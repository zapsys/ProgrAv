
package POO5;


public class Aluno extends Pessoa{
    private String sobrenome;
    private int idade;

    public Aluno(String sobrenome, int idade, String nomePessoa) {
        super(nomePessoa);
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    
    

}
