import javax.script.SimpleScriptContext;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String nome = entrada.nextLine();

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual sua altura (m)");
        double altura = entrada.nextDouble();

        System.out.println("Qual seu peso? (kg)");
        double peso = entrada.nextDouble();

        // Calcule o IMC = peso / altura  ^ 2
        double imc = peso / (altura * altura);

        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos");
        System.out.println("Este e seu IMC" + imc);
        System.out.printf("Este e o seu IMC = %.2f \n", imc);
        System.out.printf("Olá, meu nome é %s e tenho %d anos! \n", nome, idade);

        /**
         // https://www.calculoimc.com.br/tabela-de-imc/ */
        if (imc < 17) {
            System.out.printf("Muito abaixo do peso");
        } else if (imc >= 17 && imc <= 18.49) {
            System.out.printf(" Abaixo do peso ");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.printf(" Peso normal ");
        }
        else if (imc >= 25 && imc <= 29.99) {
            System.out.printf(" Acima do peso "); }
        else if (imc >= 30 && imc <= 34.99) {
            System.out.printf(" Obesidade I ");}
        else if (imc >= 35 && imc <= 39.99) {
            System.out.printf(" Obesidade II (Svera ");}
        else {
            System.out.println("Obesidade III (mórbida)" ) ;
        }
        //Switch-case
        System.out.println("Selecione uma dieta ( 1 a 3)");
        System.out.println("1 - Água");
        System.out.println("2 - Fruta");
        System.out.println("3 - Batata");
        int dieta = entrada.nextInt();

        switch (dieta) {
            case 1:
                System.out.println("Você escolheu a dieta dá água!"); break;
            case 2:
                System.out.println("Você escolheu a dieta dá Fruta!"); break;
            case 3:
                System.out.println("Você escolheu a dieta dá Batata!"); break;
            default: // else
                System.out.println("Esta dieta não existe!");
        }
        System.out.println( "Você tem quantos alimentos preferidos?");
        int totalDeAlimentos = entrada.nextInt();

        for (int i = 0 ; i < totalDeAlimentos; i ++ ) {
           System.out.println(i);
        }

        // OU
        int i = 0;
        while (i < totalDeAlimentos) {
            System.out.println(i);
            i++;
        }
    }
}

