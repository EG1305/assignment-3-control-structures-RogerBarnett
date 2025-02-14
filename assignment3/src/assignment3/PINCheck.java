package assignment3;
/* 
 * Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * A program to ask for a PIN and then verify that PIN and tell you when you get it correct.
 */
import java.util.Scanner;

public class PINCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int enteredPIN;
        int confirmPIN;
        boolean pinCorrect = false;

        System.out.println("Please enter your PIN");
        enteredPIN = scanner.nextInt(); // Get USers PIN

        while (!pinCorrect) {
            System.out.println("Please confirm your PIN"); // Ask to confirm PIN
            confirmPIN = scanner.nextInt();

            if (enteredPIN == confirmPIN) { //Check for if PIN is correct and if no then re ask
                pinCorrect = true;
                System.out.println("PIN accepted. You can access your account");
            } else {
                System.out.println("Incorrect PIN. Try again");
            }
        }
        scanner.close();
    }
}