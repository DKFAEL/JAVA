package aulas.poo.fazenda;


//Na interface você define um conjunto de métodos
// E a classe que "herda" deve implementatar estes métodos
public interface Animal {
    void  dormir (); // definição do método apenas
    void fazerSom();
    void comer(String comida);
}

// PRA REPRESENTAR A INTERFACE SE USA IMPLEMENTS (OBS: DA PRA ATRIBUIR O EXTENDS ANTES DO IMPLEMENTS)

class  Gato implements  Animal {
    @Override
    public void dormir() {
        System.out.println("zzzZZzz Miau");
    }

    @Override
    public void fazerSom() {
        System.out.println("Miiiaau");
    }

    @Override
    public void comer(String comida) {
        if (comida.equals("Peixe")){
            System.out.println("Humm i love peixe");
        } else {
            System.out.println("Vá pesca meu peixe");
        }
    }
}


class  Galinha implements Animal {

    @Override
    public void dormir() {
        System.out.println("Có có zizziz");
    }

    @Override
    public void fazerSom() {
        System.out.println("Có có có có");
    }

    @Override
    public void comer(String comida) {
        System.out.println("Hmm có có hmm " + comida);
    }

    public static void main(String[] args) {
        Galinha galinha = new Galinha();
        Gato gato = new Gato();

        galinha.fazerSom();
        galinha.dormir();
        galinha.comer("Milho");

        gato.fazerSom();
        gato.dormir();
        gato.comer("Peixe");

        //Interface não consigo criar um objeto
        //Animal novoAnimal = new Animal();// não consigo criar pois é interface

        Animal animalGalinha = new Galinha();
        Animal animalGatinho = new Gato();
              //OUUU
        //Animal animalGalinha = galinha;
        //Animal animalGatinho = gato;


        System.out.println("====POLIMORFISMO");
        animalGalinha.fazerSom();
        animalGatinho.fazerSom();
    }
}