package practice;

import java.util.Scanner;

public class orderingFastFood {
    public static void main(String[]args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to Fastfood Ordering!\n");
        System.out.print("Enter your name: ");
        String name = s.nextLine();

        boolean isLooping = true;

        int burger = 50;
        int pizza = 90;
        int softdrinks = 10;

        int total = 0;

        while(isLooping) {
            System.out.println("1. Burger - 50");
            System.out.println("2. Pizza - 90");
            System.out.println("3. Softdrink - 10");
            System.out.println("4. Done\n");

            System.out.println("Total: " + total + "\n");

            System.out.print("Enter you're choice here: ");
            int choice = s.nextInt();

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter Quantity: ");
                    int burgerQuan = s.nextInt();

                    total += burgerQuan * burger;
                    break;
                case 2:
                    System.out.print("Enter Quantity: ");
                    int pizzaQuan = s.nextInt();

                    total += pizzaQuan * pizza;
                    break;
                case 3: 
                    System.out.print("Enter Quantity: ");
                    int softdrinksQuan = s.nextInt();

                    total += softdrinksQuan * softdrinks;
                    break;
                case 4:
                    System.out.print("Are you sure?(y/n): ");
                    char isYes = s.next().charAt(0);
                    if (isYes == 'y') {
                        isLooping = false;
                    } else {
                        isLooping = true;
                    }
                default:
                    System.out.println("Invalid number");
                    break;
            }
            System.out.println();
        }

        System.out.println("\nThank you for ordering " + name + "!");
        System.out.println("The total bill is " + total);
    }    
}
