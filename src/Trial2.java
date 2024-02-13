import java.util.Scanner;
import java.util.Random;
public class Trial2 {
    public void run() {
        int userGuess = 0;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int targetNumber = rand.nextInt(0,10);
        int guessesNeeded = 1;
        boolean guessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");

        while (!guessedCorrectly && guessesNeeded < 10) {
            System.out.println("Guess " + guessesNeeded + " number(s) between 1 and 10:");

            boolean allGuessesCorrect = true;
            for (int i = 0; i < guessesNeeded; i++) {
                targetNumber = rand.nextInt(0,10);
                try {
                    userGuess = scanner.nextInt();
                }
                catch (Exception e){
                    System.out.println("enter an int");
                    System.exit(66769996);
                }
                if (userGuess != targetNumber) {
                    allGuessesCorrect = false;
                }
            }

            if (allGuessesCorrect) {
                System.out.println("Congratulations! You guessed all " + guessesNeeded + " number(s) correctly: " + targetNumber);
                guessedCorrectly = true;
            } else {
                System.out.println("Sorry, you didn't guess correctly.");
                guessesNeeded++;
                System.out.println("You now need to guess " + guessesNeeded + " number(s) to win.");
            }
        }

        scanner.close();
    }
}
