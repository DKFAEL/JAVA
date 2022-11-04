public class Endereco {
private  int idEndereco;
    private String bairro;
    private String rua ;
    private int  cep ;
    private int  numero ;
    private String  uf ;
    private String referencia;
    private int idCliente ;

    public Endereco(int idEndereco, String bairro, String rua, int cep, int numero, String uf, String referencia, int idCliente) {
        this.idEndereco = idEndereco;
        this.bairro = bairro;
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        this.uf = uf;
        this.referencia = referencia;
        this.idCliente = idCliente;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public int getCep() {
        return cep;
    }

    public int getNumero() {
        return numero;
    }

    public String getUf() {
        return uf;
    }

    public String getReferencia() {
        return referencia;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
