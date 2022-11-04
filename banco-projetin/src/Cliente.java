public class Cliente {

    private int idCliente;
    private String nomeCompleto;
    private String email;
    private String telefone;
    private int dataNasc;


    public Cliente( int idCliente ,String nomeCompleto, String email, String telefone, int dataNasc){
        this.idCliente = idCliente;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }



    public String getTelefone() {
        return telefone;
    }



    public int getDataNasc() {
        return dataNasc;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }


}