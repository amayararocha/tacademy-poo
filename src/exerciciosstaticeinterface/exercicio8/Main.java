package exerciciosstaticeinterface.exercicio8;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {64, 34, 25, 12, 22, 11, 90};
        int[] array2 = {38, 27, 43, 3, 9, 82, 10};

        // Usando BubbleSort
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(array1);
        System.out.println("Array ordenado pelo BubbleSort:");
        printArray(array1);

        // Usando QuickSort
        Sortable quickSort = new QuickSort();
        quickSort.sort(array2);
        System.out.println("\nArray ordenado pelo QuickSort:");
        printArray(array2);
    }

    // Método auxiliar para imprimir um array
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
