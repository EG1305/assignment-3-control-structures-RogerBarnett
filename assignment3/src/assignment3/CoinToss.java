package assignment3;
/* 
 * Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * A program to randomly toss a coin a certain number of times and calculating the sum of each result. 
 */
import java.util.Scanner;

public class CoinToss {
	
		//randomizing method
		public static int RNG() {
			int random = (int) (Math.random() * 10);
			return random;
		}
		
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       

        System.out.println("How many coin tosses do you need?");
        int numTosses = scanner.nextInt(); // Get USers desired number of coin flips

        System.out.println("Now I will toss the coin " + numTosses + " times.");

        int headsCount = 0; // Set the starting sums to zero
        int tailsCount = 0;

        for (int i = 0; i < numTosses; i++) {
            int toss = RNG() % 2; // 0 for tails, 1 for heads

            if (toss == 0) {
                System.out.println("Toss: tails");
                tailsCount++; // Add to the sum of tails
            } else {
                System.out.println("Toss: heads");
                headsCount++; // Add to the sum of heads
            }
        }

        System.out.println("Heads facing up: " + headsCount); // Prints final totals
        System.out.println("Tails facing up: " + tailsCount);

        scanner.close(); 
    }
}