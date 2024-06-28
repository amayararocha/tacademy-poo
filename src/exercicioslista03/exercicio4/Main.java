package exercicioslista03.exercicio4;

public class Main {

    public static void main(String[] args) {
        // Criando um funcionário
        Funcionario funcionario1 = new Funcionario("Joãozinho", "Analista de Sistemas", 4500.00, "TI");

        // Exibindo detalhes iniciais do funcionário
        funcionario1.exibirDetalhes();

        // Promovendo o funcionário
        funcionario1.promover("Gerente de Projetos", 6000.00);

        // Exibindo detalhes atualizados do funcionário após a promoção
        funcionario1.exibirDetalhes();
    }
}
