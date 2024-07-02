package exerciciosstaticeinterface.exercicio4;

import static exerciciosstaticeinterface.exercicio4.ProductManager.*;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Notebook", 2000.00);
        Product p2 = new Product("Smartphone", 500.00);
        Product p3 = new Product("Tablet", 600.00);

        // Adicionando produtos
        addProduct(p1);
        addProduct(p2);
        addProduct(p3);

        // Listando produtos
        listProducts();

        // Removendo um produto
        removeProduct(p2);

        // Listando produtos após remoção
        listProducts();
    }
}
