package biblioteca;

import java.util.ArrayList;

/**
 * Crie uma classe Livro que possui :
 * Atributos: nome, autor, preço:
 * Construtor:
 *              -Cria livros com  base nos parâmetros nome,
 *              autor (objetos da classe Autor), preço*/
public class Livro {
    private  String nome;
    private Autor autor ;
    //Composição
    private  double preco ;

    public Livro(String nome, Autor autor, double preco) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor=" + autor +
                ", preco=" + preco +
                '}';
    }



    public static void main(String[] args) {
        Autor jk = new Autor("JK", "JK@gmail.com");
        Livro pedraFilosofal = new Livro ("Harry Potter e a Pedra Filosofal", jk, 24.9);
        System.out.println("===========");

        System.out.println(pedraFilosofal.autor.getNome());
        System.out.println(pedraFilosofal.autor.getEmail());
        System.out.println( "Autor: "+ pedraFilosofal.autor.getNome()  + "\n Filme: " + pedraFilosofal.nome + " \npreço: " + pedraFilosofal.preco );

        Livro camaraSecerta = jk.escreverLivro("Harry Poter e a Camara Secreta",30.0);

        System.out.println(camaraSecerta.autor.getNome());

        Livro prisioneiroAzkhaban = jk.escreverLivro("Harry potter e o prisioneiro de Azkhaban", 40.0);

        ArrayList <Livro> livrosjk = new ArrayList<>();
        livrosjk.add(pedraFilosofal);
        livrosjk.add(prisioneiroAzkhaban);
        livrosjk.add(camaraSecerta);

        System.out.println(livrosjk);
    }

}
