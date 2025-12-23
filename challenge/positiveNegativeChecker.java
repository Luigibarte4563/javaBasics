import java.util.Scanner;

public class positiveNegativeChecker {
    public static void main(String[]args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = s.nextInt();

        if(number > 0) {
            System.out.println(number + " is postive");
        } else if(number < 0) {
            System.out.println(number + " is negative");
        }else {
            System.out.println(number + " is equal to zero");
        }
    }    
} 
