package exerciciosstaticeinterface.exercicio4;

import java.util.ArrayList;
import java.util.List;

class ProductManager {
    private static List<Product> productList = new ArrayList<>();

    // Método para adicionar produto
    public static void addProduct(Product product) {
        productList.add(product);
    }

    // Método para remover produto
    public static void removeProduct(Product product) {
        productList.remove(product);
    }

    // Método para listar todos os produtos
    public static void listProducts() {
        if (productList.isEmpty()) {
            System.out.println("Nenhum produto disponível.");
        } else {
            System.out.println("Lista de produtos:");
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }
}