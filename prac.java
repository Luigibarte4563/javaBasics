import java.util.Scanner;

public class prac {

    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        int lives = 3;
        String answer;

        while(lives > 0){

            System.out.println("what is the biggest planet in the solar system? ");

            System.out.print("input the answer here : ");
            answer = s.nextLine();

            if (answer.equalsIgnoreCase("sun")){
                System.out.println("congrats, your correct");
                break;
            }else lives--;{
                System.out.println("try again");
            }
        }
        if(lives > 0){
            System.out.println("you won!!");
        }else{
            System.out.println("game over");
        }

    }
    
}
