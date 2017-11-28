/* Classe java 'Circulo' que implementa métodos para as propriedades do círculo a partir do raio */

package POO1;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double area(){
        return(Math.PI * Math.pow(raio, 2));
    }

    public double perimetro(){
        return(2 * Math.PI * raio);
    }

    public double diametro(){
        return(2 * raio);
    }

    public double volume(){
        return ((4/3.0) * Math.PI * Math.pow(raio, 3));
    }
}
