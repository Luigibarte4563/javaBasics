import java.util.Scanner;

public class math {
    
    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        System.out.print("input number : ");
        int num1 = s.nextInt();

        System.out.print("input number : ");
        int num2 = s.nextInt();

        System.out.print("input number : ");
        int num3 = s.nextInt();

        int num4 = 1000;

        int max = Math.max(num1, num2, Math.max(num3, num4));

        System.out.println(max);

    }
}
