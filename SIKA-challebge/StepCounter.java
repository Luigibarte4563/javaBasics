import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>();

        while(sc.hasNextLine()) {
            list.add(sc.nextInt());
        }

        int count = 0;

        for(int i = 1; i < list.size(); i++) {
            if(list.get(i) > list.get(i - 1)) {
                count++;
            }
        }

        System.out.print(count);
    }
}