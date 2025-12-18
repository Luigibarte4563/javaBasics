import java.util.Scanner;

public class averageCalculator {
    public static void main(String[]args)  {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter 3 quizes here to calculate the average\n");

        double total = 0;
        int index = 1;

        while(index <= 3) {
            System.out.print("Enter quiz " + index + " score: ");
            double num = s.nextDouble();

            total += num;
            index++;
        }

        double average = total / 3;
        System.out.println("\nAverage Score: " + average);

        if(total >= 75) {
            System.out.println("Remark: Passed");
        } else {
            System.out.println("Remark: Failed");
        }
    }   
}
