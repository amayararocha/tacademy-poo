package exerciciosstaticeinterface.exercicio9;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter1 = new UsdToEurConverter();
        CurrencyConverter converter2 = new EurToThbConverter();

        // Conversão USD para EUR
        double amountUsd = 100;
        double convertedAmountEur = converter1.convert(amountUsd, "USD", "EUR");
        System.out.println(amountUsd + " USD equivalem a " + convertedAmountEur + " EUR");

        // Conversão EUR para THB
        double amountEur = 50;
        double convertedAmountThb = converter2.convert(amountEur, "EUR", "THB");
        System.out.println(amountEur + " EUR equivalem a " + convertedAmountThb + " THB");
    }
}
