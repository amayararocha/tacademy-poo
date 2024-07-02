package exerciciosstaticeinterface.exercicio1;

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        //Para imprimir
        System.out.println("Número de instâncias criadas: " + Counter.getCount());
    }
}
