package assignment3;
/* 
 * Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * A program to determine the number of prime numbers that come before a user given number
 */
import java.util.Scanner;

public class Primes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number. The System will find all the prime number smaller than this number.");
        int number = scanner.nextInt(); // Assign users input to a variable

        int count = 0; // Initialize prime number counter
        int numbersPrinted = 0; // Keep track of numbers printed per line

        if (number > 2) {
            System.out.print("2\t");
            count++;
            numbersPrinted++;
        }

        for (int i = 3; i < number; i += 2) { // Repeat checking if a number is Prime for each number in the given set
            boolean isPrime = true;
            for (int j = 3; j * j <= i; j += 2) { // Formula for determining if a number is prime
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) { // Print Prime Numbers
                System.out.print(i + "\t");
                count++;
                numbersPrinted++;

                // Check if 10 numbers have been printed on the current line
                if (numbersPrinted == 10) {
                    System.out.println(); // Move to the next line
                    numbersPrinted = 0; // Reset the counter for the new line
                }
            }
        }

        System.out.println(); // New line for formatting (if the last line wasn't full)
        System.out.println("There are a total of " + count + " prime numbers");

        scanner.close();
    }
}