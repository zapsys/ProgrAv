/* Classe abstrata 'Dados' */

package POO;

public class Dados {
    // Atributos (propriedades da classe)
    public int a;
    public int b;

    public int adicao(){
        return (a + b);
    }

    public int subtracao(){
        return(a - b);
    }

    public int multiplicacao(){
        return (a * b);
    }
    public int divisaoInteira(){
        if (b != 0)
            return(a / b);
        else
            return(0);
    }
    public double divisaoReal(){
        return(a / (double)b);
    }

}
