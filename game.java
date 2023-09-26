import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 7; // Maximum number of attempts for each round
        int score = 0; // Player's score (number of rounds won)

        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            System.out.println("I have generated a number between " + minRange + " and " + maxRange);
            System.out.println("Can you guess the number?");

            while (attempts < maxAttempts) {
                int guess = scanner.nextInt();
                attempts++;

                if (guess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (guess < generatedNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + generatedNumber);
                }
            }

            System.out.println("Do you want to play again? (Y/N)");
            String playAgainChoice = scanner.next();
            playAgain = playAgainChoice.equalsIgnoreCase("Y");
        }

        System.out.println("Your final score: " + score);
        System.out.println("Thanks for playing! Goodbye.");
    }
}