import java.util.Scanner;

public class oddEvenChecker {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int odd = 0;
		int even = 0;
		
		System.out.print("Enter a number to check: ");
		int n = s.nextInt();
		
		int[] num = new int[n];
		
		System.out.println();
		
		for(int a = 0; a < num.length; a++) {
			System.out.print("Enter number " + (a + 1) + ": ");
			int number = s.nextInt();
			
			if(number % 2 != 0) {
				odd++;
			} else {
				even++;
			}
		}
		System.out.println("\nEven numbers: " + even);
		System.out.println("Odd numbers: " + odd);
	}
}