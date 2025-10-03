import java.util.Scanner;
import java.util.Random;

class hello {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        int numberRand = rand.nextInt(2);
        int guess;

        boolean isCorrect = true;
        while(isCorrect) {
            System.out.print("Enter a number a to guess: ");
            guess = s.nextInt();

            if(guess == numberRand) {
                System.out.println("You guess the right number!! yey");
                isCorrect = false;
            }else if(guess != numberRand) {
                System.out.println("Sorry try again huhu");
                isCorrect = true;
            }
        }
    }
}