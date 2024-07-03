package exerciciosextras.exercicioextra3;

abstract class Reino {
    private String nomeReino;

    public Reino(String nomeReino) {
        this.nomeReino = nomeReino;
    }

    public String getNomeReino() {
        return nomeReino;
    }

    public abstract String getTipo();

    @Override
    public String toString() {
        return "Reino: " + nomeReino + "\n";
    }
}
