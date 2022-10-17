package aulas.poo;

public class Pessoa {
    // Prpipriedades/atributos de uma Pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    Pessoa()  {
        this.nome = "José";
        this.sobrenome = "Carlos";
        this.idade = 29;
        this.peso = 55.0;
        this.altura = 1.65;
    }
     // Utilizando a msm CLASS
    Pessoa (String nome, String sobrenome, int idade, double peso, double altura){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    Pessoa (String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.altura = 0.5;
        this.peso = 2.0;

    }
    // Açoes de uma Pessoa (métodos)
    //  <tipo_retorno> nomeDoMetodo(PARAMETRO) {}

                            // VOID NÃO TEM RETORNO
    void  dizOla () { // Método
        System.out.println("Olá, tudo bem?  Meu nome é " + this.nome + " " + this.sobrenome);
    }

    void  mostrarImc () {
        double imc = this.peso / (this.altura * this.altura);
        System.out.println("O meu IMC é " + imc);
    }
    double calculaImc() {
        double imc = this.peso / (this.altura * this.altura);
        return  imc;
    }
    void comer (String comida){
        System.out.println("Estou comendo " + comida);
    }
}
