package aulas.poo;

public class Bicicleta {
    private int marcha ;
    private int velocidade ;

    public Bicicleta(int marcha, int velocidade){
        this.marcha = marcha;
        this.velocidade = velocidade;
    }


                //So pode usar o toString quando utilizar um object
    @Override
    public String toString() { //retornar a representação do objeto eem string
        return "Bicicleta(marcha= " + this.marcha + ", " +"velocidade="+ this.velocidade  + ")";
    }

    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(21,0);
        Bicicleta bicicleta2 = new Bicicleta(15, 5);
        System.out.println(bicicleta);
        System.out.println(bicicleta2);
    }
}
