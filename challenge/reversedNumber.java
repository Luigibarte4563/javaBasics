import java.util.Scanner;

public class reversedNumber {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        boolean negative = false;

        if(n < 0) {
            negative = true;
            n = -n;
        }

        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed  = reversed * 10 + digit;
            n /= 10; 
        }

        if(negative) {
            reversed = -reversed;
        }

        System.out.println(reversed);
    }
}