import java.util.Scanner;

public class upperCaseLowerCaseChecker {
    public static void main(String[]args){
        
        Scanner s = new Scanner(System.in);

        System.out.print("enter a letter: ");
        char letter = s.next().charAt(0);

        if(Character.isUpperCase(letter)){
            System.out.println("uppercase letter");
        }else if(Character.isLowerCase(letter)){
            System.out.println("lowercae letter");
        }else{
            System.out.println("invalid input");
        }

        s.close();
    }
}
