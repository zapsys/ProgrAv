/* Classe java pai ou superclasse 'Pessoa' */

package POO5;


public class Pessoa {
    private String nomePessoa;

    public Pessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    } 
}
