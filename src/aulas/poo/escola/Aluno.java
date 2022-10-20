package aulas.poo.escola;

public class Aluno  extends Pessoa {
    private double media;

    //Chamada do super deve vir primeiro
    public Aluno(String nome, String email, String cpf, double media) {
        super(nome, email, cpf); // Estou chamando um construtor de Pessoa
        this.media = media;
    }


    @Override
    public void seApresentar() {
        super.seApresentar();
        System.out.println("Eu sou um aluno com média = " + this.media);
    }

    public double getMedia (){
        return  this.media ;
    }

}