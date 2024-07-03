package exerciciosextras.exercicioextra3;

class Genero extends Familia {
    private String nomeGenero;

    public Genero(String nomeReino, String nomeFilo, String nomeClasse, String nomeOrdem, String nomeFamilia, String nomeGenero) {
        super(nomeReino, nomeFilo, nomeClasse, nomeOrdem, nomeFamilia);
        this.nomeGenero = nomeGenero;
    }

    public String getNomeGenero() {
        return nomeGenero;
    }

    @Override
    public String toString() {
        return super.toString() + "Gênero: " + nomeGenero + "\n";
    }
}
