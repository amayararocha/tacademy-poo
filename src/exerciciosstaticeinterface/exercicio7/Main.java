package exerciciosstaticeinterface.exercicio7;

public class Main {
    public static void main(String[] args) {
        Speakable dog = new Dog();
        Speakable cat = new Cat();

        dog.speak();
        cat.speak();
    }
}