package exercicios64;

import java.util.Scanner;

public class Estoque_M {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    double minima, media, maxima;

        System.out.println("Calculadora de Estoque Médio");

        System.out.println("Digite o valor do estoque minimo");
        minima = entrada.nextDouble();
        System.out.println("Digite o valor do estoque maximo");
        maxima = entrada.nextDouble();


        media = ( minima + maxima) / 2;

        System.out.println("A média de estoque é: " +media);
    }
}
