package exercicioslista02.exercicio8;

import java.time.LocalDate;
import java.time.Period;

public class JogadorDeFutebol {
    private String nome;
    private String posicao;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    public JogadorDeFutebol(String nome, String posicao, LocalDate dataNascimento, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return this.posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Posição: " + this.posicao);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Altura: " + this.altura + "m");
        System.out.println("Peso: " + this.peso + "kg");
        System.out.println("Idade: " + this.calcularIdade() + " anos");
        System.out.println("Anos restantes para aposentadoria: " + this.anosParaAposentadoria() + " anos");
    }

    public int calcularIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    public int anosParaAposentadoria() {
        int idadeDeAposentadoria;
        switch (this.posicao.toLowerCase()) {
            case "defesa":
                idadeDeAposentadoria = 40;
                break;
            case "meio-campo":
                idadeDeAposentadoria = 38;
                break;
            case "atacante":
                idadeDeAposentadoria = 35;
                break;
            default:
                System.out.println("Posição não reconhecida. Não é possível determinar a idade de aposentadoria!");
                return -1;
        }

        return idadeDeAposentadoria - this.calcularIdade();
    }
}
