package exercicios64;

import java.util.Scanner;

public class ConversorDe$ {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double cotacao, dolar, real;

        System.out.println("Conversor  de dolar para real ");
        System.out.println("Digite a cotação do dólar: ");
        cotacao = entrada.nextDouble();
        System.out.println("Dgite o valor do dólar: ");
        dolar = entrada.nextDouble();


        real = cotacao * dolar ;

        System.out.println("O valor em reais são R$: " +real);


    }
}
