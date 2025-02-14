package assignment3;
/* 
 * Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * A program to calculate the rice on a chessboard on the 64th square and in total
 */
import java.math.BigInteger;

public class RiceChessboard {

    public static void main(String[] args) {
        // Calculate rice on the 64th square
        BigInteger riceOn64thSquare = calculateRiceOnSquare(64);
        System.out.println("Rice on the 64th square: " + riceOn64thSquare);

        // Calculate total rice on the chessboard
        BigInteger totalRice = calculateTotalRice();
        System.out.println("Total rice on the chessboard: " + totalRice);
    }

    // Method for calculating Rice on any square using BigInteger
    public static BigInteger calculateRiceOnSquare(int square) {
        BigInteger base = new BigInteger("2");
        return base.pow(square - 1);
    }

    public static BigInteger calculateTotalRice() {
        BigInteger totalRice = BigInteger.ZERO; // Initialize to BigInteger 0
        for (int i = 1; i <= 64; i++) {
            totalRice = totalRice.add(calculateRiceOnSquare(i));
        }
        return totalRice;
    }
}