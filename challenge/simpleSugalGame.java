import java.util.*;

public class simpleSugalGame {
    public static void main(String[]args) {

        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        int number = (int)(Math.random() * 10); 
        int deposit = 0;
        int withdraw = 0;
        int totalWin = 0;
        int totalLost = 0;
        int balance = deposit;

        System.out.print("Enter your name: ");
        String name = s.nextLine();

        System.out.println("\nWelcome " + name);
        System.out.print("Your balance is " + balance + "\n");
        System.out.print("Deposit a cash here: ");
        deposit = s.nextInt();
        balance += deposit;

        System.out.println();

        System.out.println("Welcome to the Sugal Guessing Game!\n");

        boolean isLooping = true;
        int guess;

        while(isLooping) {
            if(balance > 0) {
                System.out.println("------------------------------");
                System.out.println("Your current balance is " + balance);
                System.out.print("Guess number (0-9) : ");
                guess = s.nextInt();
    
                if(guess == number) {
                    System.out.println("you guess it right! You earn 10 pessos");
                    balance += 10;
                    totalWin += 10;
                }else {
                    System.out.println("Sorry, Your lost 10 pessos");
                    balance -= 10;
                    totalLost -= 10;
                }

                System.out.println("Do you want to continue? (y/n): ");
                char Continue = s.next().charAt(0);
                
                if(Continue == 'y') {
                    isLooping = true;
                }else if(Continue == 'n') {
                    isLooping = false;
                }else {
                    System.out.println("Invalid input " + "'" + Continue + "'");
                }
    
                System.out.println();
            }

        }

        System.out.println("Total Win " + totalWin);
        System.out.println("Toatal Lost " + totalLost);
    }    

}
