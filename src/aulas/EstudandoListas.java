package aulas;

import java.util.ArrayList;

public class EstudandoListas {
    public static void main(String[] args) {
        // Cria um novo ArrayList vazio que guarda Integer
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        System.out.println(numeros);

        //Adicionando elementos no Array

        numeros.add(10); // EQUIVALE AO PUSH NO JS
        numeros.add(20);
        numeros.add(1000);

        System.out.println(numeros);
        System.out.println(numeros.get(2)); // .GET   EQUIVALE NO JS NUMEROS[2]
        // PRA ALTERAR UM VALOR
        numeros.set(0, 500);  // A POSIÇÃO QUE IRA ALTERAR E DPS O  VALOR
        System.out.println(numeros);

        //REMOVE O ELEMENTO NA POSIÇÃO 0
        numeros.remove(0);
        System.out.println(numeros);

        // ADICIONA O ELEMENTO NA POSIÇÃO E MOVE OS DEMAIS
        numeros.add(1,200);
        System.out.println(numeros);

        // ADICIONA UMA POSIÇÃO E UM ELEMENTO
        numeros.add(3,200);
        System.out.println(numeros);

        System.out.println(numeros.size());  // ARRAY.LENGTH

        for(int i = 0; i <numeros.size(); i++ ) {
            System.out.println(numeros.get(i));
        }
        System.out.println("-----");
        for (int numero : numeros) { //     Para cada valor dentro do Array ele executa o código
            System.out.println(numero);
        }
        System.out.println(numeros.contains(500)); // true = achou, false = não achou
        System.out.println(numeros.indexOf(1000)); // Qual a posição do 1000 na lista?
        System.out.println(numeros.indexOf(500)); // -1 = não achou o elemento
        System.out.println(numeros.indexOf(200)); // Mostra o Array do primeiro encontrado se tiver mais de 1 igual
        System.out.println(numeros.lastIndexOf(200)); // mostra o ultimo encontrado

    }
}
