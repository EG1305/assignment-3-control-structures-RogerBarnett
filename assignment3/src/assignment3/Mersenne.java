package assignment3;
/* 
 * Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * A program to determine the number of Mersenne prime numbers that come before a user given number
 */
import java.util.Scanner;

public class Mersenne {

    public static boolean isPrime(int num) { // Determines if a number is prime
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMersennePrime(int num) { // Determines if a number is Mersenne
        if (num <= 1) {
            return false;
        }
        int n = 2;
        int mersenne = (1 << n) - 1; // Use bitwise left shift for 2^n
        while (mersenne <= num) {
            if (mersenne == num) {
                return isPrime(mersenne);
            }
            n++;
            mersenne = (1 << n) - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number. The System will find all the Mersenne prime numbers smaller than this number.");
        int limit = scanner.nextInt(); // Get user defined limit

        int count = 0; // Initialize count of Mersenne prime numbers

        for (int i = 3; i < limit; i++) {
            if (isMersennePrime(i)) { // Is true when a number is both Mersenne and then prime
                System.out.print(i + "\t");
                count++;
            }
        }

        System.out.println(); // Newline after printing the primes
        System.out.println("There are a total of " + count + " Mersenne prime numbers");

        scanner.close();
    }
}