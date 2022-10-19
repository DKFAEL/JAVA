package exercicios;

/**
 * Crie uma classe Circulo que possui:
 * 	* Atributos: raio, cor.
 * 	* Construtores:
 * 		- Cria circulos com base no parâmetro raio do construtor;
 * 		- Cria círculos de raio 1;
 * 	* Métodos:
 * 		- calcularArea() => deve retornar double (PI * RAIO * RAIO)
 * 		- calcularCircunferencia => deve retornar double (2 * PI * RAIO)
 * 		- mudarRaio(double novoRaio) => deve alterar o valor do raio
 */
public class CirculoExercicio {

   public double raio;
    public String cor ;

    public double pi ;

    CirculoExercicio(String cor, double raio, double pi) {
        this.cor =cor;
        this.raio = raio;
        this.pi = pi ;

    }
        double calculoArea () {
            double area = (this.pi * this.raio * this.raio);
            return area;
    }
    double calcularCircunferencia() {
        double circunferencia = (2 * this.pi * this.raio);
        return  circunferencia;
    }



}


