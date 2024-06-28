package exercicioslista03.exercio2;

public class Produto {

    // Atributos
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Getters and setters
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

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Método para atualizar o estoque do produto
    public void atualizarEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
        if (quantidadeEmEstoque < 0) {
            quantidadeEmEstoque = 0; // Não permite estoque negativo
        }
    }

    // Método para simular uma compra de produtos
    public double comprar(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            atualizarEstoque(-quantidade); // Reduz a quantidade em estoque
            return preco * quantidade; // Retorna o total da compra
        } else {
            System.out.println("Estoque insuficiente!");
            return 0;
        }
    }

    // Método para exibir os detalhes do produto
    public void exibirDetalhes() {
        System.out.println("---------------------------");
        System.out.println("Detalhes do Produto:");
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: R$" + getPreco());
        System.out.println("Quantidade em Estoque: " + getQuantidadeEmEstoque());
        System.out.println("---------------------------");
    }
}
