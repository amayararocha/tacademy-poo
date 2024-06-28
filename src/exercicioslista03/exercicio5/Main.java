package exercicioslista03.exercicio5;

public class Main {
    public static void main(String[] args) {
        // Criando uma casa
        Casa casa1 = new Casa("Rua das Flores, 123", 3, 120.0, 350000.0);

        // Exibindo detalhes da casa
        casa1.exibirDetalhes();

        // Calculando e exibindo o valor do imposto
        double taxaImposto = 0.02; // 2% de taxa de imposto
        double valorImposto = casa1.calcularValorImposto(taxaImposto);
        System.out.println("Valor do Imposto: R$" + valorImposto);

        // Atualizando e exibindo os detalhes da casa
        casa1.setEndereco("Avenida Central, 456");
        casa1.setNumeroDeQuartos(4);
        casa1.setArea(150.0);
        casa1.setValor(450000.0);
        casa1.exibirDetalhes();

        // Recalculando e exibindo o valor do imposto
        valorImposto = casa1.calcularValorImposto(taxaImposto);
        System.out.println("Novo Valor do Imposto: R$" + valorImposto);
    }
}
