package gr.aueb.cf.challenges.ch13.bankapp.model;

/**
 * Represents a bank account shared between two users.
 */
public class JointAccount {

    private String user1;
    private String user2;
    private String iban;
    private double balance;

    public JointAccount() {
    }

    public JointAccount(String user1, String user2, String iban, double balance) {
        this.user1 = user1;
        this.user2 = user2;
        this.iban = iban;
        this.balance = balance;
    }

    public String getUser1() {
        return user1;
    }

    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public String getUser2() {
        return user2;
    }

    public void setUser2(String user2) {
        this.user2 = user2;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Deposits a given amount into the account.
     *
     * @param amount the amount to deposit
     * @throws IllegalArgumentException if the amount is not positive
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount. Amount must be positive.");
        }
        balance += amount;
    }

    /**
     * Withdraws a given amount from the account if sufficient funds are available.
     *
     * @param amount the amount to withdraw
     * @throws IllegalArgumentException if the amount is not positive or funds are insufficient
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdraw amount. Amount must be positive.");
        }
        if (balance < amount) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

}
