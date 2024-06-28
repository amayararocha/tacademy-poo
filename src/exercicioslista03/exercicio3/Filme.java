package exercicioslista03.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    // Atributos
    private String titulo;
    private String diretor;
    private int anoLancamento;
    private String genero;

    // Construtor
    public Filme(String titulo, String diretor, int anoLancamento, String genero) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Método para exibir os detalhes do filme
    public void mostrarDetalhes() {
        System.out.println("--------DETALHES DO FILME---------");
        System.out.println("Título: " + getTitulo());
        System.out.println("Diretor: " + getDiretor());
        System.out.println("Ano de Lançamento: " + getAnoLancamento());
        System.out.println("Gênero: " +getGenero());
        System.out.println("----------------------------------");
    }
}
