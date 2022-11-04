public class Main {
    public static void main(String[] args) {

        Cliente cliente =  new Cliente(1,"Rafael Nunes","rafaelnns@gmail.com", "71984085932",02/11/199);
        Endereco endereco = new Endereco(1,"Periperi","Waldir Pires",40720-374,24,"BA","Casa",1);
        Conta conta = new Conta(1,7832,30017-9,1);
        Banco banco = new Banco(1,10000, "Nubank",1);

        banco.salarioCaiu();
        System.out.println( cliente.getNomeCompleto());
        System.out.println(endereco.getUf());
        System.out.println("IdConta: " + conta.getIdConta());
        System.out.println(banco.getBanco());

        System.out.println("Saldo: " + banco.getSaldo());

        System.out.println("SESSÃO ENCERRADA!");
    }
}