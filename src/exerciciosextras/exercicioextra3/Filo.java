package exerciciosextras.exercicioextra3;

class Filo extends Reino {
    private String nomeFilo;

    public Filo(String nomeReino, String nomeFilo) {
        super(nomeReino);
        this.nomeFilo = nomeFilo;
    }

    public String getNomeFilo() {
        return nomeFilo;
    }

    @Override
    public String getTipo() {
        return "Espécie";
    }

    @Override
    public String toString() {
        return super.toString() + "Filo: " + nomeFilo + "\n";
    }
}
