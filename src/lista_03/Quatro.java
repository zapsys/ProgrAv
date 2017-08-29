/* Vetor de 10 posições com números aleatórios de 10 a 50 */



public class Quatro {
    public static void main(String args[]) {

        int i;
        int n = 10;
        int valor[] = new int[n];

        for(i = 0; i < n; i++){
            valor[i] = (int)(Math.random()*40 + 11);
        }

        int soma = 0;
        int sum5 = 0;
        int dif;

        for(i = 0; i < n; i++){

            soma = soma + valor[i];

            if (valor[i] %5 != 0)
                System.out.printf("vetor[%d] = %d\n", i, valor[i]);
            else {
                sum5 = sum5 + valor[i];
                System.out.printf("vetor[%d] = %d " + " <=== Múltiplo de 5\n", i, valor[i]);
            }
        }

        dif = soma - sum5;

        System.out.println();

        System.out.printf("Soma total:.......................................... = %d\n", soma);
        System.out.printf("Soma múltiplos de 5:................................. = %d\n", sum5);
        System.out.printf(".....................................................\n");
        System.out.printf("Soma - soma múltiplos de 5:.......................... = %d\n", dif);

    }
}
