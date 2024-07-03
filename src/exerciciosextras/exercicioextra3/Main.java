package exerciciosextras.exercicioextra3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Especie> seresVivos = new ArrayList<>();

        Especie cacto = new Especie("Vegetal", "Magnoliophyta", "Magnoliopsida", "Caryophyllales", "Cactaceae", "Cactaceae", "Cactaceae", "Cacto");
        seresVivos.add(cacto);

        Especie bolor = new Especie("Fungi", "Zygomycota", "Zygomycetes", "Mucorales", "Mucoraceae", "Rhizopus", "Rhizopus stolonifer", "Bolor");
        seresVivos.add(bolor);

        Especie elefante = new Especie("Animal", "Chordata", "Mammalia", "Proboscidea", "Elephantidae", "Elephas", "Elephas maximus", "Elefante");
        seresVivos.add(elefante);

        for (Especie ser : seresVivos) {
            System.out.println("=====================");
            System.out.println(ser);
            System.out.println("=====================");
        }
    }
}
