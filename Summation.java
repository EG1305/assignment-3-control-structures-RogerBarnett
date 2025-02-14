package assignment3;
/* 
 * Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * A program to add all the numbers provided by the user until they type a 0.
 */
import java.util.Scanner;

public class Summation {

    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0; // Start the sum at zero

        System.out.println("This program will add all the numbers you enter");
        System.out.println("Enter 0 for me to stop adding");

        do {
            number = scanner.nextInt();
            System.out.println("You entered " + number);

            sum += number; // Add the current number to the sum
            System.out.println("The sum is " + sum);

        } while (number != 0); // Continue looping as long as the number is not 0

        System.out.println("The sum of all the numbers you entered is " + sum);
        scanner.close(); 
    }
}