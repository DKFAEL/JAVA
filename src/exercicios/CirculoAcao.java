package exercicios;

public class CirculoAcao {
    public static void main(String[] args) {

        CirculoExercicio circulo1 = new CirculoExercicio("azul",10, 3.1415);

        CirculoExercicio circulo2 = new CirculoExercicio("preto",5, 3.1415);

        System.out.println(circulo1.raio);
        System.out.println(circulo1.cor);
        System.out.println(circulo1.calcularCircunferencia());
        System.out.println(circulo1.calculoArea());

        System.out.println(circulo2.raio);
        System.out.println(circulo2.cor);
        System.out.println(circulo2.calcularCircunferencia());
        System.out.println(circulo2.calculoArea());


    }
}
