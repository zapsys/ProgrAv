package lista_06;

public class Quadrado {
    public static double area(int lado){
        return(lado*lado);
    }
    public static double perimetro(int lado){
        return(4*lado);
    }
    public static double diagonal(int lado){
        return(Math.sqrt(Math.pow(lado, 2) + Math.pow(lado, 2)));
    }
}
