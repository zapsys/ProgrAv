/* Classe abstrata Animal.java */

package Nov_24;

public abstract class Aninal {
    private String nome;

    public Aninal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract void som();
    
}
