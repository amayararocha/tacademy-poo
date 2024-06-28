package exercicioslista03.exercicio6;

public class Main {
    public static void main(String[] args) {
        // Criando um celular
        Celular celular1 = new Celular("Samsung", "Galaxy S21", 128);

        // Exibindo informações iniciais do celular
        celular1.exibirInformacoes();

        // Instalando aplicativos
        celular1.instalarAplicativo("WhatsApp");
        celular1.instalarAplicativo("Instagram");

        // Exibindo informações atualizadas do celular
        celular1.exibirInformacoes();
    }
}
