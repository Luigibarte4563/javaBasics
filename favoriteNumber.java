package challenge;
import java.util.Scanner;

public class favoriteNumber {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = s.nextLine();

        System.out.print("What is your favorite number? ");
        int favoriteNumber = s.nextInt();

        System.out.println("Hello " + name + ", your favorite numeber is " + favoriteNumber + "!"); 

    }
}
