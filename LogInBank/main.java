import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String email1 = "luigi@email.com";
        String pass1 = "123";
        int amount;

        logInSystem acc1 = new logInSystem("Luigi", email1, pass1, 1000);

        System.out.println("---Bank Log In System---");

        System.out.print("Enter your email   : ");
        String emailLog = s.nextLine();

        System.out.print("Enter your password: ");
        String passLog = s.nextLine();

        if (emailLog.equals(email1) && passLog.equals(pass1)) {
            boolean running = true;
            while (running) {
                System.out.println("---Weelcome---");
                System.out.println(acc1.getName());

                System.out.println("---Please select---");
                System.out.println("1. view your balance");
                System.out.println("2. deposit");
                System.out.println("3. withdraw");
                System.out.println();

                System.out.print("Enter your selected number: ");
                int select = s.nextInt();

                switch (select) {
                    case 1:
                        System.out.print(acc1.getBal());
                        System.out.println();

                        System.out.print("you want to continue? y/n: ");
                        char cont = s.next().charAt(0);
                        if (cont == 'y') {
                            continue;
                        } else if(cont == 'n'){
                            running = false;
                        }
                    break;

                    case 2:
                        System.out.println("---Deposit---");
                        System.out.print("Enter amount to deposit: ");
                        amount = s.nextInt();

                        acc1.deposit(amount);
                        System.out.println();

                        System.out.print("you want to continue? y/n: ");
                        cont = s.next().charAt(0);
                        if (cont == 'y') {
                            continue;
                        } else if(cont == 'n') {
                            running = false;
                        }
                    break;

                    case 3:
                        System.out.println("---Withdraw---");
                        System.out.print("Enter amount to withdraw: ");
                        amount = s.nextInt();

                        acc1.withdraw(amount);
                        System.out.println();

                        System.out.print("you want to continue? y/n: ");
                        cont = s.next().charAt(0);
                        if (cont == 'y') {
                            continue;
                        } else if(cont == 'n') {
                            running = false;
                        }
                    break;

                    default:
                        System.out.println("Invalid input!");
                }
            }
        } else if (emailLog != email1 && passLog.equals(pass1)) {
            System.out.println("Invalid email!");
        } else if (emailLog.equals(pass1) && passLog != pass1) {
            System.out.println("Ivalid password!");
        } else {
            System.out.println("Invalid email and password!");
        }
    }
}
