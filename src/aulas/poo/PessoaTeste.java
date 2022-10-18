package aulas.poo;

// intuto: testar o uso daclasse Pessoa
public class PessoaTeste {
    public static void main(String[] args) {
        // new => constrói um NOVO objeto de pessoa
        Pessoa pessoa1 = new Pessoa();
       pessoa1.nome = "José"; // obj.atributo
        pessoa1.sobrenome = "Carlos";
        pessoa1.idade = 29;
        pessoa1.peso = 55.0;
        pessoa1.altura = 1.65;

        pessoa1.dizOla();

        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa("Pedro","Gomes", 35 ,30.5 , 1.75);

        Pessoa recemNascido = new Pessoa("Enzo", "Pereira");
        System.out.println(recemNascido.nome);
        recemNascido.idade++;
        recemNascido.dizOla();

        pessoa4.dizOla();
        pessoa4.mostrarImc();
        double imcPessoa4 = pessoa4.calculaImc();
        System.out.println(imcPessoa4);

        pessoa4.comer("Batata");

        //Exemplo pessoas
      Pessoa pedro = new Pessoa("Pedro", "Jose", 29, 1.8,80);
     Pessoa joao = new Pessoa("João", "Carlos", 30, 1.75,70);

     System.out.println("===============");

     pedro.cumprimetar(joao);
     pedro.cumprimetar(joao);
     pedro.comer("batata");
    }
}
