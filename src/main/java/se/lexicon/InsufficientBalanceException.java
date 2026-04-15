package se.lexicon;

public class InsufficientBalanceException extends Exception {
    private double balance;
    private double withdrawalAmount;

    public InsufficientBalanceException(String message, double balance, double withdrawalAmount) {
        super(message);
        this.balance = balance;
        this.withdrawalAmount = withdrawalAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }
}
