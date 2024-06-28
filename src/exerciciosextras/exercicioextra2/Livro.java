package exerciciosextras.exercicioextra2;
//Classe filha, herdando da superclass
public class Livro extends Produto {

    //Atributos de um livro
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private String editora;
    private String genero;

    //Constructor com parametros da classe filha e superclass
    public Livro(String nome, double preco, String autor, int anoPublicacao, int numeroPaginas, String editora, String genero) {
        super(nome, preco);
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.editora = editora;
        this.genero = genero;
    }

    //Getters and Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void imprimir() {
        System.out.println(
                "-------------------------------------\n" +
                        "     Nome: " + getNome() + "\n" +
                        "     Preço: " + getPreco() + "\n" +
                        "     Autor: " + getAutor() + "\n" +
                        "     Ano de Publicação: " + getAnoPublicacao() + "\n" +
                        "     Número de Páginas: " + getNumeroPaginas() + "\n" +
                        "     Editora: " + getEditora() + "\n" +
                        "     Gênero: " + getGenero() + "\n" +
                        "-------------------------------------"
        );
    }
}
