package se.lexicon;


public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount must be positive");
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if (amount<0){
            throw new IllegalArgumentException("Amount must be positive");
        }

        if (amount>balance){
            throw new InsufficientBalanceException("Not enough money.",balance, amount);
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
