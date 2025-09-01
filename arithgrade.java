import java.util.Scanner;

class gradeCalcu{

    public static void main (String[]args){

        Scanner s = new Scanner(System.in);
        System.out.print("input your score 1 - 100 : ");
        int score = s.nextInt();

        if(score <= 59){
            System.out.println("F");
        }else if(score >= 60 && score <= 69){
            System.out.println("D");
        }else if(score >= 70 && score <= 79){
            System.out.println("C");
        }else if(score >= 80 && score <= 89){
            System.out.println("B");
        }else if(score >= 90 && score <= 100){
            System.out.println("A");
        }else{
            System.out.println("invalid input score");
        }
        s.close();
    }
}