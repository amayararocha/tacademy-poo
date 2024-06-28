package exercicioslista03.exercicio4;

public class Funcionario {

    // Atributos
    private String nome;
    private String cargo;
    private double salario;
    private String departamento;

    // Construtor
    public Funcionario(String nome, String cargo, double salario, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Método para promover o funcionário
    public void promover(String novoCargo, double novoSalario) {
        this.cargo = novoCargo;
        this.salario = novoSalario;
        System.out.println(nome + " foi promovido para " + novoCargo + " com salário de R$" + novoSalario);
    }

    // Método para exibir os detalhes do funcionário
    public void exibirDetalhes() {
        System.out.println("---------------------------");
        System.out.println("Detalhes do Funcionário:");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + salario);
        System.out.println("Departamento: " + departamento);
        System.out.println("---------------------------");
    }
}
