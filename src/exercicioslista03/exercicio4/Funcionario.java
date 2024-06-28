package exercicioslista03.exercicio4;

public class Funcionario {

    // Atributos
    private String nome;
    private String cargo;
    private double salario;
    private String departamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

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
        System.out.println(getNome() + " foi promovido para " + novoCargo + " com salário de R$" + novoSalario);
    }

    // Método para exibir os detalhes do funcionário
    public void exibirDetalhes() {
        System.out.println("---------------------------");
        System.out.println("Detalhes do Funcionário:");
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salário: R$" + getSalario());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("---------------------------");
    }
}
