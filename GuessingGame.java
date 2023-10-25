import javax.swing.*;
 
public class GuessingGame {
    public static void main(String[] args) {
        int computerInput = (int) (Math.random()*100 + 1);
        int userInput = 0;
        int count = 1;

        while (userInput != computerInput)
        {
            String response = JOptionPane.showInputDialog(null,
                "Enter a guess between 1 and 100", "Guessing Game", 3);
            userInput = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userInput, computerInput, count));
            count++;
        }  
    }

    public static String determineGuess(int userInput, int computerInput, int count){
        if (userInput <=0 || userInput >100) {
            return "Your guess is invalid";
        }
        else if (userInput == computerInput ){
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (userInput > computerInput) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (userInput < computerInput) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}
