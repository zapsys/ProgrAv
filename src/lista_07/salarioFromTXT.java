/* Specification here */
package lista_07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class salarioFromTXT {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        FileReader arq = new FileReader("//home//aram//Temp//salario.txt");
        BufferedReader lerArq = new BufferedReader(arq);

        String linha;
        String partes[];

        linha = lerArq.readLine(); // lê a primeira linha

        System.out.printf("Nome do funcionário           Salário\n");
        System.out.printf("--------------------------------------------\n");

        double sal, tot = 0;

        while (linha != null) {
            partes = linha.split(";");
            sal = Double.parseDouble(partes[1]);
            System.out.printf("%8s %s %.2f\n", partes[0], "R$ ", sal);
            linha = lerArq.readLine(); // lê da segunda até a última linha (EOF)
            tot = tot + sal;
        }
        System.out.printf("--------------------------------------------\n");
        System.out.printf("Total %8.2f", tot);
        lerArq.close();
    }
}