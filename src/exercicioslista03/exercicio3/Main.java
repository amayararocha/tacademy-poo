package exercicioslista03.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Criando uma lista para armazenar filmes
        List<Filme> listaFilmes = new ArrayList<>();

        // Cadastrando alguns filmes na lista
        listaFilmes.add(new Filme("Interestelar", "Christopher Nolan", 2014, "Ficção Científica"));
        listaFilmes.add(new Filme("O Poderoso Chefão", "Francis Ford Coppola", 1972, "Drama"));
        listaFilmes.add(new Filme("Matrix", "Lana Wachowski, Lilly Wachowski", 1999, "Ação"));

        // Exibindo detalhes de todos os filmes da lista
        for (Filme filme : listaFilmes) {
            filme.mostrarDetalhes();
        }
    }
}
