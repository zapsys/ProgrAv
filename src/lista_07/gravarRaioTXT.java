/* Grava valores dos métodos implementados na classe java 'Circulo' (lista_05) */
package lista_07;

import lista_05.Circulo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class gravarRaioTXT {
    public static void main(String args[]) throws IOException {
        Scanner ler = new Scanner(System.in);

        double raio;


        FileWriter arq = new FileWriter("//tmp//Circulo.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

        while (true) {
            System.out.print("Informe o valor do raio, 0 para encerrar: ");
            raio = ler.nextDouble();
            if (raio == 0) {
                gravarArq.printf("Área do círculo: %.2f", Circulo.area(raio));
                gravarArq.printf("Perímetro do círculo: %.2f", Circulo.perimetro(raio));
                gravarArq.printf("Diâmetro do círculo: %.2f", Circulo.diametro(raio));
                gravarArq.printf("Volume do círculo: %.2f", Circulo.volume(raio));
                gravarArq.close();
            }
        }
    }
}