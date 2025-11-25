import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for(int a = 0; a < num.length; a++){
			System.out.print("enter a number: ");
			num[a] = s.nextInt();
		}
		
		int largest = num[0];
		
		for(int b = 1; b < num.length; b++){
			if(num[b] > largest){
				largest = num[b];
			}
		}
		System.out.println("The largest number is: " + largest);
	}
}