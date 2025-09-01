import java.util.Scanner;

public class luigi {
    
    public static void main(String[]args){

    Scanner s = new Scanner(System.in);

     System.out.println("1. numbers.");
     System.out.println("2. letters.");
     System.out.println("3. characters.");
     System.out.print("input number here : ");
     int dial = s.nextInt();

     switch(dial){
        case 1:
        System.out.println();
        System.out.println("numbers");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        break;
        case 2:
        System.out.println();
        System.out.println("letters");
        System.out.println("A. ");
        System.out.println("B. ");
        System.out.println("C. ");
        System.out.println("D. ");
        System.out.println("E. ");
        break;
        case 3:
        System.out.println();
        System.out.println("characters");
        System.out.println("!. ");
        System.out.println("@. ");
        System.out.println("#. ");
        System.out.println("$. ");
        System.out.println("%. ");
        break;
        default:
        System.out.println("invalid input number");

        
     }
    }
}
