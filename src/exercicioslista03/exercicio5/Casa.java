package exercicioslista03.exercicio5;

public class Casa {
    // Atributos
    private String endereco;
    private int numeroDeQuartos;
    private double area;
    private double valor;

    // Construtor
    public Casa(String endereco, int numeroDeQuartos, double area, double valor) {
        this.endereco = endereco;
        this.numeroDeQuartos = numeroDeQuartos;
        this.area = area;
        this.valor = valor;
    }

    // Getters e setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroDeQuartos() {
        return numeroDeQuartos;
    }

    public void setNumeroDeQuartos(int numeroDeQuartos) {
        this.numeroDeQuartos = numeroDeQuartos;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método para exibir os detalhes da casa
    public void exibirDetalhes() {
        System.out.println("---------------------------");
        System.out.println("Detalhes da Casa:");
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Número de Quartos: " + getNumeroDeQuartos());
        System.out.println("Área: " + getArea() + " m²");
        System.out.println("Valor: R$" + getValor());
        System.out.println("---------------------------");
    }

    // Método para calcular o valor do imposto
    public double calcularValorImposto(double taxa) {
        return getValor() * taxa;
    }
}
