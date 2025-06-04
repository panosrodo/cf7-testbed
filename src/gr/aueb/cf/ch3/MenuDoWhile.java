package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού μέχρι ο χρήστης
 * να επιλέξει 3, δηλαδή exit.
 */
public class MenuDoWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
            System.out.println("1. Εισαγωγή προϊόντος");
            System.out.println("2. Διαγραφή προϊόντος");
            System.out.println("3. Έξοδος");
            choice = in.nextInt();
        } while (choice != 3);

        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή.");
    }
}