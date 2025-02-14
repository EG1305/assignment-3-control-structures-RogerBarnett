package assignment3;
/* 
 * Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * A program to find the value of Pi based on the Leibniz formula and iterations
 */
import java.util.Scanner;

public class FindPI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program will iteratively find the digits of PI using the Leibniz formula");
        System.out.print("How many iterations should we use? Please enter an integer\n");

        int iterations = scanner.nextInt();

        long startTime = System.currentTimeMillis(); // Record start time

        double pi = calculatePI(iterations);

        long endTime = System.currentTimeMillis(); // Record end time
        double elapsedTimeSeconds = (endTime - startTime) / 1000.0; // Calculate elapsed time in seconds

        System.out.println("PI " + pi);
        System.out.println("After " + iterations + " iterations.");
        System.out.println("This operation took " + elapsedTimeSeconds + " seconds.");

        scanner.close();
    }

    // Leibniz formula implementation
    public static double calculatePI(int iterations) {
        double pi = 0;
        for (int i = 0; i < iterations; i++) {
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 0) {
                pi += term;
            } else {
                pi -= term;
            }
        }
        return pi * 4; // Multiply by 4 as the formula calculates PI/4
    }
}