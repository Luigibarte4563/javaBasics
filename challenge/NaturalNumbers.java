import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = s.nextInt();
		 int total = 0;
		 
		for(int a = 1; a <= num; a++) {
			total += a;		
		}
		
		System.out.println("The sum is " + total +".");
	}
}