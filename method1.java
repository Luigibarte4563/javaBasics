import java.util.Scanner;

class method{
    
    public static void main(String[]agrs){

      Scanner scan = new Scanner(System.in);

      System.out.println("guess the name: ");
      String name = scan.nextLine();

      if(name.equalsIgnoreCase("luigi")){

        int num = 10;
        System.out.println(name);
        System.out.println(num);
      }else {
        System.out.println("tanga HAHAHHAAH");
      }

    }

}
