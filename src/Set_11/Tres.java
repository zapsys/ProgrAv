/* Exercício 3: Percentual de acadêmicos por sexo usando o método (função) 'percentual' da classe 'Geral' */

package Set_11;


public class Tres {
    public static void main(String args[]) {
        System.out.printf("%.2f%% de acadêmicas\n", Geral.percentual(18, 2));
        System.out.printf("%.2f%% de acadêmicos\n", Geral.percentual(18, 16));
    }
}