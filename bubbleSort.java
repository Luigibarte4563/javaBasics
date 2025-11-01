import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int stu = 0;
		System.out.print("Enter how many students: ");
		stu = s.nextInt();
		int[] nums = new  int[stu];
		
		for(int p = 0; p < nums.length; p++) {
			System.out.print("Enter a number: ");
			nums[p] = s.nextInt();
		}
		
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums.length - 1; j++){
				if(nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
		
		System.out.print("Sorted numbers: ");
		for(int value : nums) {
			System.out.print(value + " ");	
		}
	}
}