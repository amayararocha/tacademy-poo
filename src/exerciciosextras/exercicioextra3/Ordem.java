package exerciciosextras.exercicioextra3;

class Ordem extends Classe {
    private String nomeOrdem;

    public Ordem(String nomeReino, String nomeFilo, String nomeClasse, String nomeOrdem) {
        super(nomeReino, nomeFilo, nomeClasse);
        this.nomeOrdem = nomeOrdem;
    }

    public String getNomeOrdem() {
        return nomeOrdem;
    }

    @Override
    public String toString() {
        return super.toString() + "Ordem: " + nomeOrdem + "\n";
    }
}
