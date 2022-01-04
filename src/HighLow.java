import java.lang.Math;
import java.util.Scanner;

public class HighLow {
    private static Scanner scan = new Scanner(System.in);




    public static void main(String[] args){
       boolean confirm;
        int random = (int) (Math.random()* (100 - 1) + 1);
       do{

        System.out.println(random);
        int count = 0;

        System.out.println("Guess a number between 1 and 100.");
        int userNum = scan.nextInt();
        if(userNum == random){
            System.out.println("GOOD GUESS!");
            confirm = false;

        }else if(userNum > random){
            System.out.println("LOWER");
            count++;
            confirm = true;

        }else{
            System.out.println("HIGHER");
            count++;
            confirm = true;
        }


       }while (confirm);

    }
}
