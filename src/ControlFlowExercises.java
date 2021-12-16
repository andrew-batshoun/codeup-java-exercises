import java.util.Arrays;
import java.util.Scanner;

public class ControlFlowExercises {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //1. WHILE
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }
        //2.DO WHILE
//        int num = 0;
//        do {
//            System.out.println(num);
//            num += 2;
//        } while (num <= 100);

//        int num = 100;
//        do {
//            System.out.println(num);
//            num -= 5;
//        } while (num >= -10);

//        int base = 2, exponent = 2;
//
//        do {
//            System.out.println(base);
//            base = (int) Math.pow(base, exponent);
//        } while (base < 1000000);

        //REFACTOR
//        for(int i = 0; i <= 100; i+=2){
//            System.out.printf("%d%n", i);
//        }
//        for (int i = 100; i >= -10; i -= 5){
//            System.out.println(i);
//        }

        //FIZZBUZZ
//        for(int i = 1; i<= 100; i++){
//            if(i % 3 == 0 && i % 5 == 0 ){
//                System.out.printf("FizzBuzz\n");
//            }else if (i % 5 == 0){
//                System.out.printf("Fizz\n");
//            }else if (i % 3 == 0){
//                System.out.printf("Fuzz\n");
//            }else{
//                System.out.printf("%d\n", i);
//            }
//        }

        //DISPLAY A TABLE OF POWERS
//        boolean confirm;
//        do {
//            System.out.println("what number would you like to go up to?");
//            int userNum = scan.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userNum; i++) {
//                int squared = i * i;
//                int cubed = i * i * i;
//                if (i >= 4) {
//                    System.out.printf("%d      | %d      | %d%n", i, squared, cubed);
//                } else {
//                    System.out.printf("%d      | %d       | %d%n", i, squared, cubed);
//                }
//            }
//            System.out.println();
//            System.out.println("Would you like to continue? [y/N]");
//            String userConfirm = scan.next();
//            confirm = userConfirm.equalsIgnoreCase("y");
//        } while (confirm);

        //CONVERT NUMBER GRADES TO LETTER GRADES
        boolean confirm;
        do {
            System.out.println("What is your number grade?");
            int numGrade = scan.nextInt();
            if(numGrade >= 88){
                System.out.println("Your letter grade is: A");
            }else if (numGrade >= 80){
                System.out.println("Your letter grade is: B");
            }else if (numGrade >= 67){
                System.out.println("Your letter grade is: C");
            }else if (numGrade >= 60){
                System.out.println("Your letter grade is: D");
            }else{
                System.out.println("Your letter grade is: F");
            }
            System.out.println("Do you want to continue? [y/N]");
            String userConfirm = scan.next();
            confirm = userConfirm.equalsIgnoreCase("y");
        }while (confirm);




    }
}
