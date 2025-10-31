import java.util.*;

public class randomGame {
    public static void main(String[]args) {
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;

        System.out.println("Random number: " + number);
    }    
}
