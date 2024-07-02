package exerciciosstaticeinterface.exercicio9;

class EurToThbConverter implements CurrencyConverter {
    private static final double RATE_EUR_TO_THB = 36.30;

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (fromCurrency.equals("EUR") && toCurrency.equals("THB")) {
            return amount * RATE_EUR_TO_THB;
        } else {
            System.out.println("Conversão não suportada: " + fromCurrency + " para " + toCurrency);
            return 0;
        }
    }
}