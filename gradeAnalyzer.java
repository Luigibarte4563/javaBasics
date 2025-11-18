package challenge;

import java.util.Scanner;

class gradeAnalyzer {
    public static void main(String[]args) {

        Scanner s = new Scanner(System.in);

        System.out.print("enter a number of student: ");
        int countStud = s.nextInt();

        int[] arr = new int[countStud];

        for(int a = 0; a < arr.length; a++) {
            System.out.print("Enter a grade for student " + (a + 1) + ": ");
            arr[a] = s.nextInt();
        }

        System.out.println();

        int sum = 0;
        int ave = countStud;

        System.out.print("All Grades: ");
        for(int b = 0; b < arr.length; b++) {
            System.out.print(arr[b] + " ");

            sum += arr[b];
        }

        System.out.println();

         int highestGrd = arr[0];
        int lowestGrd = arr[0];

        for(int c = 1; c < arr.length; c++) {
            if(highestGrd > arr[c]) {
                highestGrd = arr[c];
            }else{
                lowestGrd = arr[c];
            }
        }

        System.out.println("Highest Grade: " + highestGrd);
        System.out.println("Lowest Grade: " + lowestGrd);

        ave = sum/ave;

        System.out.println("Average Grade: " + ave);

        System.out.print("Grade in Reverse: ");
        for(int d = arr.length - 1; d >= 0; d--) {
            System.out.print(arr[d] + " ");
        }


    }
}