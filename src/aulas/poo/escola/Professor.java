package aulas.poo.escola;

public class Professor  extends Pessoa{
    private  String formacao;

    public Professor(String nome, String email, String cpf, String formacao) {
        super(nome, email, cpf);
        this.formacao = formacao;
    }

    @Override // indica que há sobreescrita
    public void seApresentar() {
        super.seApresentar();
        System.out.println("Eu sou um professor com formação em " +this.formacao + " para contratar meus serviços entre em contato:  " +this.getEmail());

    }
    public String getFormacao() {
        return this.formacao;
    }

}
