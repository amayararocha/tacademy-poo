package exerciciosextras.exercicioextra3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista para armazenar os seres vivos
        List<SerVivo> seresVivos = new ArrayList<>();

        // Cadastrando uma planta
        SerVivo cacto = new Planta("Cacto", "Magnoliophyta", "Magnoliopsida", "Caryophyllales", "Cactaceae", "Cactaceae", "Cactaceae");
        seresVivos.add(cacto);

        // Cadastrando um fungo
        SerVivo bolor = new Fungo("Bolor", "Zygomycota", "Zygomycetes", "Mucorales", "Mucoraceae", "Rhizopus", "Rhizopus stolonifer");
        seresVivos.add(bolor);

        // Cadastrando um animal
        SerVivo elefante = new Animal("Elefante", "Chordata", "Mammalia", "Proboscidea", "Elephantidae", "Elephas", "Elephas maximus");
        seresVivos.add(elefante);

        // Exibindo os seres vivos cadastrados
        for (SerVivo ser : seresVivos) {
            System.out.println("=======================");
            System.out.println("Tipo: " + ser.tipo());
            System.out.println(ser);
            System.out.println("=======================");
        }
    }
}
