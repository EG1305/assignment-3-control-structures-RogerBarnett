package assignment3;
/* 
 * Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * A program to create a random pin password based on a user provided length
 */
import java.util.Scanner;

public class PasswordGenerator {
	
	//randomizing method
	public static int RNG() {
		int random = (int) (Math.random() * 10);
		return random;
	}
	
    public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);

        System.out.println("How many digits do you want to use for a numeric password?");
        int numDigits = scanner.nextInt();

        System.out.println("Your password is");

        for (int i = 0; i < numDigits; i++) {
            int digit = RNG() % 10; // Generates a random integer between 0 and 9 
            System.out.print(digit + " "); // Print the digit followed by a space
        }

        scanner.close(); 
    }
}
