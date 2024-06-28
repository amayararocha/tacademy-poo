package exercicioslista03.exercicio2;

public class Main {
    public static void main(String[] args) {
        // Criando um produto
        Produto produto1 = new Produto("Notebook", 3500.00, 5);

        // Exibindo detalhes iniciais do produto
        produto1.exibirDetalhes();

        // Simulando uma compra de 2 notebooks e mostrando o total da compra
        int quantidadeComprada = 2;
        double totalCompra = produto1.comprar(quantidadeComprada);

        // Exibindo total da compra
        System.out.println("Total da Compra: R$" + totalCompra);
        System.out.println("---------------------------");

        // Exibindo detalhes atualizados do produto após a compra
        System.out.println("Detalhes do Produto após Compra:");
        produto1.exibirDetalhes();
    }
}
