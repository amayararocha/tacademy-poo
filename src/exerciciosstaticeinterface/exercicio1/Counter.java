package exerciciosstaticeinterface.exercicio1;

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
}
