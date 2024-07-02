package exerciciosstaticeinterface.exercicio2;

public class TemperatureConverter {
    // Método estático para converter de Celsius para Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método estático para converter de Fahrenheit para Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

}
