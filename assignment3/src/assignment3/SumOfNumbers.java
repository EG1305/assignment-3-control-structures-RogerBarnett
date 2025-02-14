package assignment3;
/* 
 * Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * A program to add all the numbers in a given set of numbers by the user.
 */
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("This program will add all the numbers from 1 to the number you enter");
        System.out.println("Please enter a number");

        int number = input.nextInt(); // Number the user inputed

        System.out.println("You entered " + number);

        int sum = 0; // The total of the added numbers in the given set

        for (int i = 1; i <= number; i++) {
            sum += i; // Add each number to the sum until the given number
        }

        System.out.println("The sum of all numbers from 1 to " + number + " is " + sum);

        input.close(); // Close the scanner to release resources
    }
}