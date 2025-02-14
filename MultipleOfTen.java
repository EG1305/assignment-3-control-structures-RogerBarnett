package assignment3;
/* 
 * Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * A program to count all the multiples of ten from 1 to 1000 in rows of 10. 
 */
public class MultipleOfTen {

    public static void main(String[] args) {

        int count = 0; // Keep track of numbers printed per line

        for (int i = 10; i <= 1000; i += 10) {
            System.out.print(i + "\t"); // Print the multiple of 10 with a tab

            count++; // Increment the count

            if (count == 10) {
                System.out.println(); // Move to the next line after 10 numbers
                count = 0; // Reset the count for the new line
            }
        }
    }
}
