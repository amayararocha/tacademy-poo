package exercicioslista02.exercicio11;

public class Aluno {
    private String matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    public Aluno(String matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaProva1() {
        return this.notaProva1;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() {
        return this.notaProva2;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public double getNotaTrabalho() {
        return this.notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double calcularMedia() {
        return (this.notaProva1 + this.notaProva2 + this.notaTrabalho) / 3.0;
    }

    public String verificarSituacao() {
        double media = calcularMedia();
        return media >= 6.0 ? "Aprovado" : "Reprovado";
    }

    public void imprimirDados() {
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota da Prova 1: " + this.notaProva1);
        System.out.println("Nota da Prova 2: " + this.notaProva2);
        System.out.println("Nota do Trabalho: " + this.notaTrabalho);
        System.out.println("Média Final: " + this.calcularMedia());
        System.out.println("Situação: " + this.verificarSituacao());
    }
}
