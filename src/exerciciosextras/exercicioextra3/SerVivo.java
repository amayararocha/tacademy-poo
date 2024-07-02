package exerciciosextras.exercicioextra3;

// Classe SerVivo
public abstract class SerVivo {
    private String nome;
    private String reino;
    private String filo;
    private String classe;
    private String ordem;
    private String familia;
    private String genero;
    private String especie;

    // Construtor
    public SerVivo(String nome, String reino, String filo, String classe, String ordem, String familia, String genero, String especie) {
        this.nome = nome;
        this.reino = reino;
        this.filo = filo;
        this.classe = classe;
        this.ordem = ordem;
        this.familia = familia;
        this.genero = genero;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getFilo() {
        return filo;
    }

    public void setFilo(String filo) {
        this.filo = filo;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    // Métodos abstratos que devem ser implementados pelas subclasses
    public abstract String tipo();

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Reino: " + reino + "\n" +
                "Filo: " + filo + "\n" +
                "Classe: " + classe + "\n" +
                "Ordem: " + ordem + "\n" +
                "Família: " + familia + "\n" +
                "Gênero: " + genero + "\n" +
                "Espécie: " + especie + "\n";
    }
}
