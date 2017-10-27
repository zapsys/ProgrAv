package lista_POO1;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double area(){
        return (lado * lado);
    }

    public double perimetro(){
        return (4 * lado);
    }

    public double diagonal(){
        return (Math.sqrt(Math.pow(lado, 2) + Math.pow(lado, 2)));
    }
}
