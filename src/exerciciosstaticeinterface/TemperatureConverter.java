package exerciciosstaticeinterface;

public class TemperatureConverter {
    // Método estático para converter de Celsius para Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método estático para converter de Fahrenheit para Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        double celsius = 30.0;
        double fahrenheit = 50.0;

        System.out.println(celsius + " °C é igual a " + celsiusToFahrenheit(celsius) + " °F");
        System.out.println(fahrenheit + " °F é igual a " + fahrenheitToCelsius(fahrenheit) + " °C");
    }
}
