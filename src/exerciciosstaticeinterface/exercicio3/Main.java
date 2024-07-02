package exerciciosstaticeinterface.exercicio3;

import static exerciciosstaticeinterface.exercicio3.Geometry.*;

public class Main {
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
