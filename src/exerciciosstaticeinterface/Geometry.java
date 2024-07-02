package exerciciosstaticeinterface;

public class Geometry {
    // Método para calcular a área de um quadrado
    public static double squareArea(double side) {
        return side * side;
    }

    // Método para calcular a área de um retângulo
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    // Método para calcular a área de um triângulo
    public static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }

    // Método para calcular a área de um círculo
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Método para calcular a área de um cubo
    public static double cubeArea(double side) {
        return 6 * side * side;
    }

    // Método para calcular a área de um paralelepípedo
    public static double rectangularPrismArea(double length, double width, double height) {
        return 2 * (length * width + length * height + width * height);
    }

    // Método para calcular a área de um trapézio
    public static double trapezoidArea(double base1, double base2, double height) {
        return ((base1 + base2) * height) / 2;
    }

    // Método para calcular a área de uma esfera
    public static double sphereArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Testando os métodos
        System.out.println("Área do quadrado: " + squareArea(4));
        System.out.println("Área do retângulo: " + rectangleArea(5, 3));
        System.out.println("Área do triângulo: " + triangleArea(6, 2));
        System.out.println("Área do círculo: " + circleArea(3));
        System.out.println("Área do cubo: " + cubeArea(2));
        System.out.println("Área do paralelepípedo: " + rectangularPrismArea(3, 4, 5));
        System.out.println("Área do trapézio: " + trapezoidArea(7, 5, 3));
        System.out.println("Área da esfera: " + sphereArea(4));
    }
}

