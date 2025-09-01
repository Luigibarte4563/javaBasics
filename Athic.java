import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Athic {
    public static void main(String[]agrs){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = s.nextLine();

        System.out.print("Enter your birthdate (YYYY-MM-DD): ");
        String birthdateInput = s.nextLine();

        LocalDate birdate = LocalDate.parse(birthdateInput);

        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birdate, currentDate);

        System.out.println("welcome, " + name + "!");
        System.out.println("Your birthday is: " + birdate);
        System.out.println("You are " + age.getYears() + " years old.");

        s.close();

    }
}
