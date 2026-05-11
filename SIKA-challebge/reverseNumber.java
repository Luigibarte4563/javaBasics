import java.util.Scanner;

public class reverseNumber {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
     
        boolean negative = false;

        if(n < 0) {
            negative = true;
            n = -n;
        }

        int reverse = 0;

        while(n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        if(negative) {
            System.out.print(-reverse);
        }else {
            System.out.print(negative);
        }
    }
}