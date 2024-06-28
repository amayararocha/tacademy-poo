package exercicioslista03.exercio1;

public class Pessoa {

    // Atributos
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    // Construtor
    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    // Método para envelhecer a pessoa
    public void envelhecer() {
        System.out.println("-----ENVELHECENDO-----");
        idade++;
    }

    // Método para engordar a pessoa
    public void engordar(double pesoGanho) {
        System.out.println("-----GANHANDO PESO-----");
        peso += pesoGanho;
    }

    // Método para emagrecer a pessoa
    public void emagrecer(double pesoPerdido) {
        System.out.println("-----EMAGRECENDO-----");
        peso -= pesoPerdido;
        if (peso < 0) {
            peso = 0; // Não permite peso negativo
        }
    }

    // Método para mostrar as informações da pessoa
    public void mostrarInformacoes() {
        System.out.println("----------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("----------------------------");
    }
}
