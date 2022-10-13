import java.util.Arrays;
import java.util.Scanner;

public class EstudandoStrings {
    public static void main(String[] args) {
        //Strings são cadeias de caracteres
        //"José" -> J = 0, o =1, s = 2, é =3
        String nome = "Pedro";

        if (nome == "Pedro") {
            System.out.println("São iguais!");
        }
        System.out.println("Digie seu sobrenome");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        if (sobrenome.equals("Pereira")) { // aqui  compara o conteúdo das Strings
            System.out.println("São iguais");
        } else {
            System.out.println("São diferentes");
        }
        //sobrenome.equalsIgnoreCase("pereira"); // ignora maisuculo e minusculo

        //Outros métodos
        String java = "Java";
        String ja = java.substring(0,2);// começa do 0 e vai até o 2 (não inclusão)
        String va = java.substring(2);// corta do 2 ate o final da String

        System.out.println(ja);
        System.out.println(va);

        String m1 = "Hello, ";
        String m2 = "World!";
        String m3 = m1.concat(m2); // m1 + m2
        System.out.println(m3);

        System.out.println(java.length());// quantos caracteres ele possui
        System.out.println(java.isEmpty()); // verifica se está vazio => " "
        System.out.println(java.toUpperCase());// JAVA em  CAIXA  ALTA
        System.out.println(java.toLowerCase());// java em  caixa baixa

        // Exemplo
        System.out.println("Digite seu nome: ");
        String  seuNome = entrada.nextLine();

        if(seuNome.toUpperCase().equals("JOSÉ")) {
            System.out.println("SEU NOME E JOSÉ");
        }
        String data = "13/10/2022";
        String[] valores = data.split("/"); //["13", "10", "2022"]
        System.out.println(valores[0]);

        String email="rafaelnunesemp@hotmail.com";
        String[] valoresEmail = email.split("@"); // ["rafaelnunesemp", "hotmail.com]

        System.out.println(Arrays.toString(valoresEmail));

        String nome2 = "José Souza";
        String[] nomesSeparados = nome2.split(" ");
        System.out.println(nomesSeparados[0]);

        String teste = "Amnhã é sexta-feira";
        String[] teste2 = teste.split("");
        System.out.println(Arrays.toString(teste2));
    }
}
