package aulas.poo;

import java.util.ArrayList;

public class Pessoa {
    // Propriedades, atributos de uma pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    ArrayList<Pessoa> conhecidos = new ArrayList<>();
    Pessoa(){
        this.nome = "José";
        this.sobrenome = "Carlos";
        this.idade = 35;
        this.peso = 89;
        this.altura = 1.70;
    }
    Pessoa(String nome, String sobrenome, int idade, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;

    }
    Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.altura = 0.3;
        this.peso = 5;
    }
    // Ações
    // <tipo_retorno> nomeDoMetodo(parametros){}
    void dizOla() { // método
        System.out.println("Olá, tudo bem?\nMeu nome é: "
                +this.nome);
    }
    void mostrarImc(){
        double imc = this.peso / (this.altura*this.altura);
        System.out.println("O meu IMC é: "+imc);
    }
    double calculaImc(){// sempre que atribuir um tipo precisar ter o return
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }
    void comer(String comida){
        System.out.println("Estou comendo "+comida);
    }
    void cumprimetar(Pessoa pessoa){
        this.dizOla();
        pessoa.dizOla();

        if(!this.conhecePessoa(pessoa)){
            this.addPessoaNova(pessoa);
            pessoa.conhecePessoa(this); // this é o objeto que chama cumprimentar

        }
    }

    private void addPessoaNova(Pessoa pessoa){ // faz o objeto conhecer
        System.out.println(this.nome + " Conheceu "+ pessoa.nome + "!");
        this.conhecidos.add(pessoa);
    }
    boolean conhecePessoa(Pessoa pessoa){
        //Se True, a pessoa(this) conhece a outra pessoa
        //Se False, não conhece
        return this.conhecidos.contains(pessoa);
    }
}