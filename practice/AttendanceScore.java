public class AttendanceScore {

    public static double calculate(int daysOfPresent, int totalDays) {
        return ((double) daysOfPresent / totalDays) * 10;
    }

    public static void printScore(double score) {
        System.out.printf("- Attendance Score : %.2f / 10\n", score);
    }
}
