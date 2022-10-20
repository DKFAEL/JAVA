package aulas.poo.escola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Carlos josé", "carlos@hotmail.com", "0000000000", 7.5);
        aluno.seApresentar();

        Professor professor = new Professor("Joao Pedro", "joao@gmail.com", "0000000000", "TI");
        professor.seApresentar();

        Pessoa p1 = new Pessoa("Maria", "Mmaria@gmail.com", "0009999");
        p1.seApresentar();

        Pessoa p2 = new Aluno("Carlos josé", "carls@hotmail.com", "0000000000", 8.5);

        Pessoa p3 = new Professor("Joao Pedro", "joao@gmail.com", "0000000000", "TI");

        System.out.println("==========");
        p2.seApresentar();
        p3.seApresentar();


       //Polimorfismo                                  (arquitetura Limpa) (Consolid)
        System.out.println("=====PESSOAS======");
        ArrayList <Pessoa> pessoas = new ArrayList<>();
        pessoas.add(aluno);
        pessoas.add(professor);
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);


        for (Pessoa pessoa : pessoas) {
            //O método seApresentar se comporta diferente dependendo da classe original
            pessoa.seApresentar();
        }
    }
}
