package exerciciosstaticeinterface.exercicio5;

import static exerciciosstaticeinterface.exercicio5.Bank.*;

public class Main {
    // Método main para testar a classe
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456", "Alice", 1000.00);
        BankAccount acc2 = new BankAccount("654321", "Bob", 500.00);

        // Abrir contas
        openAccount(acc1);
        openAccount(acc2);

        // Listar contas
        listAccounts();

        // Depositar dinheiro
        deposit("123456", 200.00);
        listAccounts();

        // Sacar dinheiro
        withdraw("654321", 100.00);
        listAccounts();

        // Transferir dinheiro
        transfer("123456", "654321", 300.00);
        listAccounts();

        // Fechar conta
        closeAccount("654321");
        listAccounts();
    }
}
