import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("enter a factorial number: ");
		int n = s.nextInt();
		
		int factorial = 1;
		
		for(int a = 1; a <= n; a++){
			factorial *= a;	
		}
		
		System.out.println("the factorial of " + " " + n + " " + "is " + factorial);
	}
}