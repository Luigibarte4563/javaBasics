import java.util.Scanner;

public class calculator {

    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        System.out.println("input num1 : ");
        int num1 = s.nextInt();

        System.out.println("input num2 : ");
        int num2 = s.nextInt();

        System.out.println("input operator : ");
        char opertr = s.next().charAt(0);

        switch(opertr){
            case '+':
            System.out.println(num1 + num2);
            break;
            case '-':
            System.out.println(num1 - num2);
            break;
            case '*':
            System.out.println(num1 * num2);
            break;
            case '/':
            System.out.println(num1 / num2);
            break;
        }
    }
}
