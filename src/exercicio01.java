import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecione uma operação: ");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        String escolha = entrada.nextLine();

        System.out.println("Digite o primeiro valor");
        double n1 = entrada.nextDouble();
        System.out.println("Digite o segundo valor");
        double n2 = entrada.nextDouble();
        double resultado = 0 ;


        switch (escolha) {
            case "1":
                resultado = n1 + n2; break;
            case "2":
                resultado = n1 - n2; break;
            case "3":
                resultado = n1 * n2; break;
            case "4":
                resultado = n1 / n2; break;
        }
        System.out.println("A Resultado é : " +resultado);
        }

    }


