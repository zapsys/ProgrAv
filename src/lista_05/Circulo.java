package lista_05;

public class Circulo {

    public static double area(double r){
        double  ar;

        ar = Math.PI * Math.pow(r,2);

        return (ar);
    }
    public static double perimetro(double r){
        double per;

        per = 2 * Math.PI * r;

        return(per);
    }
    public static double diametro(double r){
        double dia;

        dia = 2 * r;

        return(dia);
    }
    public static double volume(double r){
        double vol;

        vol = (4 * Math.PI * Math.pow(r, 3))/(3);

        return (vol);
    }

}
