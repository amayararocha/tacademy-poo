package exercicioslista02.exercicio8;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        JogadorDeFutebol defesa = new JogadorDeFutebol("Filipe Luís", "Defesa", LocalDate.of(1985, 3, 10), "Português", 1.85, 78.0);
        defesa.imprimirDados();
        System.out.println();

        JogadorDeFutebol meioCampo = new JogadorDeFutebol("Arrascaeta", "Meio-Campo", LocalDate.of(1992, 7, 22), "Espanhol", 1.75, 70.0);
        meioCampo.imprimirDados();
        System.out.println();

        JogadorDeFutebol atacante = new JogadorDeFutebol("Gabigol", "Atacante", LocalDate.of(1990, 6, 15), "Brasileiro", 1.8, 75.0);
        atacante.imprimirDados();
        System.out.println();

        JogadorDeFutebol default0 = new JogadorDeFutebol("Default", "Zaga", LocalDate.of(1998, 7, 3), "Brasileiro", 1.75, 60.0);
        default0.imprimirDados();
    }
}
