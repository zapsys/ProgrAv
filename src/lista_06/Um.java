/* Exercício 1: Avalia os números de 1000 a 9999 que satisfazem a propiedade
    num = (part1 + part2)^2
*/

package lista_06;

public class Um {
    public static void main(String args[]) {

        int num;

        for (num = 1000; num <= 9999; num++){
            if (num == (int)Math.pow(verificaNumero(num), 2)){
                System.out.printf("\n%d\n", num);
            }
        }

    }
    public static int verificaNumero(int num){
        int dividendo, resto, soma = 0;

        dividendo = num / 100;
        resto = num % 100;

        soma = soma + dividendo + resto;

        return(soma);
    }
}
