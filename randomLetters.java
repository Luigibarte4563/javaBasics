import java.util.Scanner;
import java.util.Random;

public class randomLetters {
    public static void main(String[]args){

        Random random = new Random();

        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                          'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        char randomLetters = random.next().charAt(letters);                

    }
}
