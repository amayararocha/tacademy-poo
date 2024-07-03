package exerciciosextras.exercicioextra3;

class Especie extends Genero {
    private String nomeEspecie;
    private String nomeSerVivo;

    public Especie(String nomeReino, String nomeFilo, String nomeClasse, String nomeOrdem, String nomeFamilia, String nomeGenero, String nomeEspecie, String nomeSerVivo) {
        super(nomeReino, nomeFilo, nomeClasse, nomeOrdem, nomeFamilia, nomeGenero);
        this.nomeEspecie = nomeEspecie;
        this.nomeSerVivo = nomeSerVivo;
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public String getNomeSerVivo() {
        return nomeSerVivo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Espécie: " + nomeEspecie + "\n"+
                "Nome: " + nomeSerVivo + "\n";
    }
}
