package exerciciosstaticeinterface.exercicio6;

public class Image implements Printable{
    @Override
    public void print() {
        System.out.println("Imprimindo uma imagem...");
    }
}
