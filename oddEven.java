import java.util.Scanner;

public class oddEven{
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.print("input a number: ");
        int number = scan.nextInt();

        if(number % 2 == 0){
            System.out.println("The number is even.");
        }else if(number % 1 == 0){
            System.out.println("The number is odd.");
        }else{
            System.out.println("You input invalid number.");
        }
        scan.close();
    }
}