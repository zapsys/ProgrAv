
package POO4;


public class Aluno extends Pessoa{
    private String apelido;
    private String email;

    public Aluno(String apelido, String email, String nome) {
        super(nome);
        this.apelido = apelido;
        this.email = email;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    

}
