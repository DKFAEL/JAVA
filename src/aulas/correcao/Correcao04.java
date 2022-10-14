package aulas.correcao;

import java.util.Scanner;

public class Correcao04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");


        double idd = entrada.nextDouble();

        if (idd > 18) {

            System.out.println("Você e Maior de idade");}

        else  {
            System.out.println("Você e menor de idade ");
        }

    }
}
