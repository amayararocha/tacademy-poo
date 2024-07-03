package exerciciosextras.exercicioextra3;

class Classe extends Filo {
    private String nomeClasse;

    public Classe(String nomeReino, String nomeFilo, String nomeClasse) {
        super(nomeReino, nomeFilo);
        this.nomeClasse = nomeClasse;
    }

    public String getNomeClasse() {
        return nomeClasse;
    }

    @Override
    public String toString() {
        return super.toString() + "Classe: " + nomeClasse + "\n";
    }
}
