package exerciciosstaticeinterface.exercicio2;

import static exerciciosstaticeinterface.exercicio2.TemperatureConverter.celsiusToFahrenheit;
import static exerciciosstaticeinterface.exercicio2.TemperatureConverter.fahrenheitToCelsius;

public class Main {
    public static void main(String[] args) {
        double celsius = 30.0;
        double fahrenheit = 50.0;

        System.out.println(celsius + " °C é igual a " + celsiusToFahrenheit(celsius) + " °F");
        System.out.println(fahrenheit + " °F é igual a " + fahrenheitToCelsius(fahrenheit) + " °C");
    }
}
