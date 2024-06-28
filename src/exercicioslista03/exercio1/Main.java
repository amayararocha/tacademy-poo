package exercicioslista03.exercio1;

public class Main {

    public static void main(String[] args) {
        // Criando uma pessoa
        Pessoa pessoa1 = new Pessoa("João", 30, 1.75, 70);

        // Mostrando informações iniciais
        pessoa1.mostrarInformacoes();

        // Fazendo a pessoa engordar
        pessoa1.engordar(5);

        // Mostrando informações atualizadas
        pessoa1.mostrarInformacoes();

        // Fazendo a pessoa envelhecer
        pessoa1.envelhecer();

        // Mostrando informações atualizadas
        pessoa1.mostrarInformacoes();

        // Emagrecendo a pessoa
        pessoa1.emagrecer(3);

        // Mostrando informações atualizadas
        pessoa1.mostrarInformacoes();
    }
}
