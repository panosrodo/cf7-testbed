package gr.aueb.cf.challenges.ch13.bankapp;

import gr.aueb.cf.challenges.ch13.bankapp.model.JointAccount;
import gr.aueb.cf.challenges.ch13.bankapp.model.OverdraftAccount;

public class Main {

    public static void main(String[] args) {

        JointAccount jointAccount = new JointAccount("Panos", "Maria", "GR1214515151", 1000);
        OverdraftAccount overdraftAccount = new OverdraftAccount("GR12312321", "George", 100, 50);

        try {
            overdraftAccount.withdraw(150);
            jointAccount.deposit(250);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Overdraft Account (" + overdraftAccount.getUser() + ") balance: " + overdraftAccount.getBalance());
        System.out.println("Joint Account (" + jointAccount.getUser1() + " & " + jointAccount.getUser2() + ") balance: " + jointAccount.getBalance());
    }

}
