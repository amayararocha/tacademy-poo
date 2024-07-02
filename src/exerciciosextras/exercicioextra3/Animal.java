package exerciciosextras.exercicioextra3;

// Classe Animal (subclasse de SerVivo)
public class Animal extends SerVivo {

    public Animal(String nome, String filo, String classe, String ordem, String familia, String genero, String especie) {
        super(nome, "Animal", filo, classe, ordem, familia, genero, especie);
    }

    @Override
    public String tipo() {
        return "Animal";
    }
}