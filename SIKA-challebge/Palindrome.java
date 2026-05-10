import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Palindrome {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String reverse = "";
        
        for(int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        if(s.equals(reverse)) {
            System.out.print("YES")
        } else {
            System.out.print("NO");
        }
    }
}