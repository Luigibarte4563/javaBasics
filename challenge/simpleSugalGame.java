import java.util.*;

public class simpleSugalGame {
    public static void main(String[]args) {

        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        int number = (int)(Math.random() * 10); 
        int deposit = 0;
        int withdraw = 0;
        int balance = deposit;

        System.out.print("Enter your name: ");
        String name = s.nextLine();

        System.out.println("\nWelcome " + name);
        System.out.print("Your balance is " + balance + "\n");
        System.out.print("Deposit a cash here: ");
        deposit = s.nextInt();

        System.out.print("do you want to play? (y/n)");
        char play = s.next().charAt(0);

        if(play == 'y') {
            System.out.println("Welcome to the Sugal Guessing Game!");
            

        }
    }    
}