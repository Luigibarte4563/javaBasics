import java.util.Scanner;

public class vowelConsonantAnalyzer {
    public static void main(String[]args) {

        Scanner s = new Scanner(System.in);

        int vowels = 0;
        int consonants = 0;  

        System.out.print("Enter text: ");
        String text = s.nextLine();

        for(int a = 0; a < text.length(); a++) {
            char charRead = Character.toLowerCase(text.charAt(a));
            
            if(charRead == 'a' || charRead == 'e' || charRead == 'i' || charRead == 'o' || charRead == 'o') {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels     " + vowels);
        System.out.println("Consonants " + consonants);
    }    
}
