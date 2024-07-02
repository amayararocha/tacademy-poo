package exerciciosstaticeinterface.exercicio4;

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


