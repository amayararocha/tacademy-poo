package exerciciosextras.exercicioextra3;

// Classe Planta (subclasse de SerVivo)
public class Planta extends SerVivo {

    public Planta(String nome, String filo, String classe, String ordem, String familia, String genero, String especie) {
        super(nome, "Vegetal", filo, classe, ordem, familia, genero, especie);
    }

    @Override
    public String tipo() {
        return "Planta";
    }
}
