package assignment3;
/* 
 * Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * A program to count from 1 to 1000 in rows of 10 numbers.
 */
public class thousandNumbers {

    public static void main(String[] args) {

        int number = 1;
        int count = 0; // Counter for numbers per line

        while (number <= 1000) {
            System.out.print(number + "\t"); // Print number with a tab for spacing
            number++;
            count++;

            if (count == 10) {  // Check if 10 numbers have been printed
                System.out.println(); // Move to the next line
                count = 0;         // Reset the counter
            }
        }
    }
}
