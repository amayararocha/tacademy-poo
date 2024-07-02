package exerciciosextras.exercicioextra3;

// Classe Fungo (subclasse de SerVivo)
public class Fungo extends SerVivo {

    public Fungo(String nome, String filo, String classe, String ordem, String familia, String genero, String especie) {
        super(nome, "Fungi", filo, classe, ordem, familia, genero, especie);
    }

    @Override
    public String tipo() {
        return "Fungo";
    }
}
