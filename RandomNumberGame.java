import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		int numberToGuess = r.nextInt(10) + 1;
		int tries = 0;
		int guess;
		
		do {
			System.out.print("Enter a number between (1-10): ");
			guess = s.nextInt();
			tries++;
			
			if(guess > numberToGuess){
				System.out.println("Too High");
			}else if(guess < numberToGuess){
				System.out.println("Too Low");
			}else {
				System.out.println("Congrats you guess it! " + tries + " tries");
			}
		}while(guess != numberToGuess);
	}
}