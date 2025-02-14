package assignment3;

import javax.swing.JOptionPane;

/* 
 * Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * A program to simulate playing against a computer in rock paper scissors.
 */



public class rockPaperScissors {
	
	//randomizing method
	public static int RNG() {
		int random = (int) (Math.random() * 10);
		return random;
	}
	
	public static void main(String[] args) {
		
		//Prompt the User for their Rock Paper Scissor input
        String gameInput = JOptionPane.showInputDialog(null, "Choose scissors (0), rock (1), or paper(2)");
        
        //convert input into a int
        int human = Integer.parseInt(gameInput);
        //Get computers input
        int computer = RNG() % 3;
        //if else statments to determine winner and prompt that gets shown to user
        if (human == 0 && computer == 1) {
            JOptionPane.showMessageDialog(null, "You lose: Rock beats Scissors");
        } else if (human == 0 && computer == 2) {
            JOptionPane.showMessageDialog(null, "You win: Scissors beats Paper");
        } else if (human == 1 && computer == 0) {
            JOptionPane.showMessageDialog(null, "You win: Rock beats Scissors");
        } else if (human == 1 && computer == 2) {
            JOptionPane.showMessageDialog(null, "You lose: Paper beats Rock");
        } else if (human == 2 && computer == 0) {
            JOptionPane.showMessageDialog(null, "You lose: Scissors beats Paper");
        } else if (human == 2 && computer == 1) {
            JOptionPane.showMessageDialog(null, "You win: Paper beats Rock");
        } else if (human == computer) {
            JOptionPane.showMessageDialog(null, "It's a tie!");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid input."); // Handle invalid input
        }
	}
}
