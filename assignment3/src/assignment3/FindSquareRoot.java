package assignment3;
/* 
 * Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * A program to find the value of a square root of a number provided by the user using a iteratively method
 */
import java.util.Scanner;

public class FindSquareRoot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The program will find the square root of a number");
        System.out.print("Enter a positive integer\n");

        int n = scanner.nextInt(); // Set user input to a variable

        double lastGuess = 1.0; // Initialize the lastGuess as 1
        double nextGuess = (lastGuess + n / lastGuess) / 2; // Formula for nextGuess
        int iterations = 0; // Initialize the number of iterations it will take

        while (Math.abs(nextGuess - lastGuess) >= 0.000001) { // Check accuracy of guess
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2; // Rerun the formula
            iterations++;
        }

        System.out.println("The square root of " + n + " is " + nextGuess);  
        System.out.println("The program found the result in " + iterations + " iterations");
        
        scanner.close();

    }
}