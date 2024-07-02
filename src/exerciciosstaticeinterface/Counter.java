package exerciciosstaticeinterface;

public class Counter {
    // Variável estática para manter o count
    private static int count = 0;

    // Construtor que incrementa o count
    public Counter() {
        count++;
    }

    // Método estático para retornar o valor de count
    public static int getCount() {
        return count;
    }

    // Método main para testar a classe
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        //Para imprimir
        System.out.println("Número de instâncias criadas: " + Counter.getCount());
    }
}
