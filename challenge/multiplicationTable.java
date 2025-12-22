import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[]args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int mul = s.nextInt();

        System.out.println("\nMultiplication of " + mul);

        for(int i = 1; i <= 10; i++) {
            System.out.println(mul + " x " + i + " = " +(mul * i));
        }
    }  
}
