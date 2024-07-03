package exerciciosextras.exercicioextra3;

class Familia extends Ordem {
    private String nomeFamilia;

    public Familia(String nomeReino, String nomeFilo, String nomeClasse, String nomeOrdem, String nomeFamilia) {
        super(nomeReino, nomeFilo, nomeClasse, nomeOrdem);
        this.nomeFamilia = nomeFamilia;
    }

    public String getNomeFamilia() {
        return nomeFamilia;
    }

    @Override
    public String toString() {
        return super.toString() + "Família: " + nomeFamilia + "\n";
    }
}
