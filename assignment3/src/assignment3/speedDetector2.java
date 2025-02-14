package assignment3;
/* Roger Barnett
 * Dr.Aktunc
 * Assignment 3
 * This is a Speed Detector program with user input.
 */

 import javax.swing.JOptionPane;

 public class speedDetector2 {
     
     public static void main(String[] args) {
         
         //Prompt the User for their current speed
         String speedInput = JOptionPane.showInputDialog(null, "Enter your current speed:");
         
         // Convert the input to a double
         double speed = Double.parseDouble(speedInput);
         
         // Display the Speed
         JOptionPane.showMessageDialog(null, "Your Speed is: " + speed);
         
         if (speed > 60) {
            // Display that they are speeding
            JOptionPane.showMessageDialog(null, "Slow Down! Drive Safe", "Ticket Warning", JOptionPane.WARNING_MESSAGE);
         }
         else {
            //Display that they are not speeding
            JOptionPane.showMessageDialog(null, "Congratulations! You are a safe driver.");
         }
         System.exit(0);
     }
 }