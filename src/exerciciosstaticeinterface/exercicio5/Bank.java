package exerciciosstaticeinterface.exercicio5;

import java.util.ArrayList;
import java.util.List;

// Classe Bank
class Bank {
    private static List<BankAccount> bankAccounts = new ArrayList<>();

    // Método para abrir uma conta
    public static void openAccount(BankAccount account) {
        bankAccounts.add(account);
    }

    // Método para fechar uma conta
    public static void closeAccount(String accountNumber) {
        bankAccounts.removeIf(account -> account.getAccountNumber().equals(accountNumber));
    }

    // Método para depositar dinheiro em uma conta
    public static void deposit(String accountNumber, double amount) {
        for (BankAccount account : bankAccounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }

    // Método para sacar dinheiro de uma conta
    public static void withdraw(String accountNumber, double amount) {
        for (BankAccount account : bankAccounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Conta não encontrada ou saldo insuficiente.");
    }

    // Método para transferir dinheiro entre contas
    public static void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        BankAccount fromAccount = null;
        BankAccount toAccount = null;

        for (BankAccount account : bankAccounts) {
            if (account.getAccountNumber().equals(fromAccountNumber)) {
                fromAccount = account;
            }
            if (account.getAccountNumber().equals(toAccountNumber)) {
                toAccount = account;
            }
        }

        if (fromAccount != null && toAccount != null && fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
        } else {
            System.out.println("Transferência falhou. Verifique os dados e o saldo disponível.");
        }
    }

    // Método para listar todas as contas
    public static void listAccounts() {
        if (bankAccounts.isEmpty()) {
            System.out.println("Nenhuma conta disponível.");
        } else {
            System.out.println("Lista de contas bancárias:");
            for (BankAccount account : bankAccounts) {
                System.out.println(account);
            }
        }
    }
}