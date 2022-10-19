package aulas.poo;

public class Cachorro extends Pet {
    private String comidaFavorita;
    private String raca;

        public Cachorro (String nome, int idade, double peso, String comidaFavorita, String raca){
            //Super  está representa a classe Pet
            super(nome, idade, peso); // Chamando o construtor da classe pai/superclasse
            this.comidaFavorita = comidaFavorita;
            this.raca = raca;
        }

    @Override //usado pra substituir a classe pai
            //Sobrescreve a ação fazerSom

    public void fazerSom() { //vamos sobreescrever a ação de fazer som
        System.out.println("au au");
    }

    @Override //usado pra substituir a classe pai

    public void brincar() { // o cachrro late na hora de brincar
        this.fazerSom(); // chama o fazerSom do cachorro, foi sobrescrito
        super.brincar(); // esta chamando o brincar() de Pet
        this.dormir(); // chama o dormir do Pet, pois nao foi sobrescrito
    }

    @Override //usado pra substituir a classe pai

    public void comer(String comida) {
            //verifica se é a comida favorita
        if (comida.equals(this.comidaFavorita)){
            super.comer(comida);
            this.setPeso(this.getPeso() + 0.2);
        } else{
            System.out.println("Quero " + comida + " não");
        }
    }


    public void correrAtrasMoto() {
            this.fazerSom();
        System.out.println("Correndo atrás da moto");
    }


    public static void main(String[] args) {
            //Testar a herança
             Pet pet1 = new Pet("Fred",3, 12.5);
             pet1.dormir();
             pet1.comer("Batata");
             pet1.fazerSom();

             System.out.println("==========");

             Cachorro batata = new Cachorro("Rex",5,25,"Osso","Caramelo");
             batata.dormir();
             batata.fazerSom();
             batata.comer("Osso");
             batata.setPeso(20);
             batata.brincar();
             batata.correrAtrasMoto();
             batata.comer("Osso");
        System.out.println(batata.getPeso());




        }
}
