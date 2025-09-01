import java.util.Scanner;

public class kape {

    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        System.out.print("input num1 : ");
        int num1 = s.nextInt();

        System.out.print("input num2 : ");
        int num2 = s.nextInt();

        int maxNum = Math.max(num1, num2);

        System.out.println("the max number is " + maxNum);

    }
    
}
