package exerciciosstaticeinterface.exercicio5;

import java.util.ArrayList;
import java.util.List;

// Classe BankAccount
class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Construtor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Métodos para depositar e sacar dinheiro
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    // Representação em string da conta
    @Override
    public String toString() {
        return "Conta: " + accountNumber + ", Titular: " + accountHolder + ", Saldo: " + balance;
    }
}


