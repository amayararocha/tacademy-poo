package exercicios.exercicioextra2;

public class Main {
    public static void main(String[] args) {
        // Criando e instanciando a lista de livros
        Livro[] livros = {
                new Livro("Dom Casmurro", 35.50, "Machado de Assis", 1899, 256, "Editora Globo", "Romance"),
                new Livro("O Guarani", 42.30, "José de Alencar", 1857, 320, "Editora Martin Claret", "Aventura"),
                new Livro("A Moreninha", 28.75, "Joaquim Manuel de Macedo", 1844, 192, "Editora Ática", "Romance"),
                new Livro("Capitães da Areia", 33.80, "Jorge Amado", 1937, 272, "Editora Companhia das Letras", "Ficção")
        };

        // Imprimindo os detalhes dos livros
        for (Livro livro : livros) {
            livro.imprimir();
        }
    }
}
