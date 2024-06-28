package exercicios.exercicioextra1;

public class Aluno {
    private String nome;
    private int idade;
    private String matricula;

    public Aluno() {
    }

    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{nome='" + this.nome + "', idade=" + this.idade + ", matricula='" + this.matricula + "'}";
    }
}
