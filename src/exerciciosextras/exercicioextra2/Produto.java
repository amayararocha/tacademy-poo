package exerciciosextras.exercicioextra2;

//Superclass - abstrata para não ser instanciada
public abstract class Produto {

    //Atributos
    private String nome;
    private double preco;

    //Constructor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
