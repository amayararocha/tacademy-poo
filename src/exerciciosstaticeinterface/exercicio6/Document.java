package exerciciosstaticeinterface.exercicio6;

public class Document implements Printable{
    @Override
    public void print() {
        System.out.println("Imprimindo um documento...");
    }
}
