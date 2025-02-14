package assignment3;
/* 
 * Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * A program to determine if a number is Prime or not repeatedly until it receives a 0.
 */
import java.util.Scanner;

public class PrimeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will tell you if the number you enter is prime or not");
        System.out.println("You can enter 0 anytime to stop the program");

        int number; 

        do {
            System.out.println("Please enter a number");
            number = scanner.nextInt(); // Users inputed number

            boolean isPrime = true;

            if (number == 1) {
                isPrime = false; // 1 is not prime
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) { // Determines if the number is not Prime
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) { // Prints result 
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }

        } while (number != 0);

        scanner.close(); 
    }
}