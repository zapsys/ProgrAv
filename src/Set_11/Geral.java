/* Classe 'Geral' que implementa diversos métodos usados no 'package Set_11' */

package Set_11;

public class Geral {
    public static int fatorial(int n){

        int i, f = 1;

        for(i = 1; i <= n; i++){
            f = f * i;
        }
        return(f);
    }

    public static int combinacoes(int n, int p){

        return (fatorial(n) / (fatorial(p) * fatorial(n -p)));

    }

    public static double imc(double pesoCorporal, double altura){

        return(pesoCorporal / Math.pow(altura, 2));
    }

    public static String interpretarIMC(double vlrIMC){
        if (vlrIMC < 10.5)
            return("Baixo peso");
        else if (vlrIMC < 25.0)
            return ("Peso adequado");
        else if (vlrIMC < 30.0)
            return ("Sobrepeso");
        else
            return("Obesidade");
    }

    public static double divisao(double n, double d){

        if (d != 0)
            return (n / d);
        else
            return (0);
    }

    public static double percentual(double todo, double parte){

        return (divisao(parte, todo) * 100);
    }
}
