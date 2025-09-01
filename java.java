import java.util.Scanner;

class calculator{

    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        System.out.print("input num1 : ");
        int num1 = s.nextInt();

        System.out.print("input num2 : ");
        int num2 = s.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        System.out.println("this is the sum : " + sum);
        System.out.println("this is the sub : " + sub);
        System.out.println("this is the mul : " + mul);
        System.out.println("this is the div : " + div);
    }
}