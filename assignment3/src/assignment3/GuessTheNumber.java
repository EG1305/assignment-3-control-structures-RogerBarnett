package assignment3;
/* 
 * Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * A program to randomly choose a number that you have to guess 
 */
import java.util.Scanner;

public class GuessTheNumber {
	
		//randomizing number for 1-100
		public static int RNG100() {
			int random = (int) (Math.random() * 101);
			return random;
			}
		
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);

        int numberToGuess = RNG100() % 100 + 1; // Generates 0-99, then adds 1 to make it 1-100

        int numberOfGuesses = 0; // Initialize the number of guesses
        
        while (true) {
            
            System.out.print("Guess a number between 1 and 100: "); // Prompts for a guess
            
                int guess = scanner.nextInt(); // Assign the guess to a variable
                numberOfGuesses++; // Increment for each attempt it takes

                if (guess < numberToGuess) { // Tell you if you are too high or too low
                    System.out.println("Too low. Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                } else {
                    System.out.println("Congratulations. You guessed the number!");
                    System.out.println("You guessed the correct number in " + numberOfGuesses + " guesses."); // Tells you how many guesses you took.
                    break; // Exit the loop
                }
            }
        scanner.close();
        }
        
    }