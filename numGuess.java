import java.util.Random;
import java.util.Scanner;

public class numGuess{
    public static void main(String[]args){

        Random random = new Random();
        Scanner s = new Scanner(System.in);

        int randomNumber = random.nextInt(5) + 1;
        int userGuess = 0;
        int attempts = 0;

        while(userGuess != randomNumber){
            System.out.print("guess a number 1-5: ");
            userGuess = s.nextInt();

            if(userGuess == randomNumber){
                System.out.println("congrats you won the game!. ");
            }else{
                System.out.println("try again men.");
            }
            
            attempts++;
            System.out.println("attempts " + attempts);
        }

        if(attempts < 5){
            System.out.println("you attempts less than 5");
            System.out.println("you're attempts is " + attempts);
        }else if(attempts > 5 && attempts <= 10){
            System.out.println("you attempts more than 5");
            System.out.println("you're attempts is " + attempts);
        }else{
            System.out.println("subrang daming attempts naman yan putang in mo");
            System.out.println("you're attempts is " + attempts);
        }
        
        s.close();
    }
}