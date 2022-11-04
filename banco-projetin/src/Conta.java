public class Conta {
    private int idConta ;
    private int agencia ;
    private int conta ;
    private int idCliente ;


    public Conta(int idConta, int agencia, int conta, int idCliente) {
        this.idConta = idConta;
        this.agencia = agencia;
        this.conta = conta;

        this.idCliente = idCliente;
    }




    public int getIdConta() {
        return idConta;
    }


    public int getAgencia() {
        return agencia;
    }


    public int getConta() {
        return conta;
    }






    public int getIdCliente() {
        return idCliente;
    }


    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }



    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
