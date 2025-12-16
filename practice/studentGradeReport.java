import java.util.Scanner;

class studentGradeReport {

    public static void main(String[]args) {

        Scanner s = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("        STUDENT GRADE REPORT         ");
        System.out.println("=====================================");

        System.out.print("Enter ID of student    : ");
        String id = s.nextLine();
        
        System.out.print("Enter name of student: ");
        String name = s.nextLine();

        System.out.println();
        System.out.println("Attendance:");
        System.out.print("- Days of Present: ");
        int daysOfPresent = s.nextInt();
        System.out.print("- Total Days     : ");
        int totalDays = s.nextInt();
        
        double score = AttendanceScore.calculate(daysOfPresent, totalDays);
        AttendanceScore.printScore(score);

    }
}