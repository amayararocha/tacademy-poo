package exerciciosstaticeinterface.exercicio9;

public class UsdToEurConverter implements CurrencyConverter{
    private static final double RATE_USD_TO_EUR = 0.90;

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            return amount * RATE_USD_TO_EUR;
        } else {
            System.out.println("Conversão não suportada: " + fromCurrency + " para " + toCurrency);
            return 0;
        }
    }
}
