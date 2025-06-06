package gr.aueb.cf.challenges.ch13.bankapp.model;

/**
 * Represents a bank account with an overdraft feature, allowing withdrawals beyond the available balance.
 */
public class OverdraftAccount {

    private String iban;
    private String user;
    private double balance;
    private double overdraftLimit = 250;

    public OverdraftAccount() {
    }

    public OverdraftAccount(String iban, String user, double balance, double overdraftLimit) {
        this.iban = iban;
        this.user = user;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Withdraws an amount from the account, allowing overdraft up to a limit.
     *
     * @param amount the amount to withdraw
     * @throws IllegalArgumentException if the amount is invalid or exceeds limit
     */
    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (balance + overdraftLimit < amount) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    /**
     * Deposits an amount to the account.
     *
     * @param amount the amount to deposit
     * @throws IllegalArgumentException if the amount is not positive
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        balance += amount;
    }

}


