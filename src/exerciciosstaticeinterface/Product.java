package exerciciosstaticeinterface;

import java.util.ArrayList;
import java.util.List;

// Classe Product
class Product {
    private String name;
    private double price;

    // Construtor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Representação em string do produto
    @Override
    public String toString() {
        return "Produto: " + name + ", Preço: " + price;
    }
}

// Classe ProductManager
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
