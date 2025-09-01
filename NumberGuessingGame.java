import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        // Create a Random object to generate a random number
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(5) + 1; // 1 to 5

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0; // Initialize user's guess
        int attempts = 0; // Initialize attempts counter

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        // Loop until the user guesses the correct number
        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt(); // Read the user's guess
            attempts++; // Increment the attempts counter

            // Provide feedback to the user
            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " in " + attempts + " attempts.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
