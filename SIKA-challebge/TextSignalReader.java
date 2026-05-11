import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TextSignalReader {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        int upper = 0; 
        int lower = 0;
        int number = 0;
        int symbols = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if(Character.isUpperCase(ch)){
                upper++;
            }else if(Character.isLowerCase(ch)){
                lower++;
            }else if(Character.isDigit(ch)) {
                number++;
            }else{
                symbols++;
            }
        }
        System.out.print(upper + " " + lower + " " + number + " " + symbols);
    }
}