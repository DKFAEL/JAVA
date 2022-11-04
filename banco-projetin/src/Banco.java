public class Banco {
    private  int idBanco;

    private  int saldo;
    private String banco;


    private int idConta;


    public Banco(int idBanco,int saldo ,String banco, int idConta) {
        this.idBanco = idBanco;
        this.saldo = saldo;
        this.banco = banco;
        this.idConta = idConta;
    }

    public void salarioCaiu() {
        System.out.println("Salario adicionado a conta corrente!");
        this.saldo += 4000;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getIdBanco() {
        return idBanco;
    }

public  int getIdConta() {
        return idConta;
}

    public String getBanco() {
        return banco;
    }


    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }
}
