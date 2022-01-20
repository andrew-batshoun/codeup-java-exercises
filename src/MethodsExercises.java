import java.lang.Math;
import java.util.Scanner;

public class MethodsExercises {
    private static Scanner scan = new Scanner(System.in);
    //Basic Arithmetic

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
//        Jay's solution
//        if(num1 > num2){
//            return subtraction(num2, num1);
//        }
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
//        return num1 * num2;
        if (num2 == 0) {
            return 0;
        } else {
            return (num1 + multiplication(num1, num2 - 1));
        }
    }


    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }


    //Create a method that validates that user input is in a certain range

    public static int getInteger(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = scan.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("Your number is with in range.");
            return userInput;
        } else {
            System.out.println("That is not in range.");
            return getInteger(min, max);
        }

    }


    public static long factorial(int n) {
        long output = 1;

        for (int i = 1; i <= n; i++) {
            output *= i;

            System.out.println("The factorial of " +i + "! = " + output);
        }
        return output;

    }

    //    public static long factorial(long n) {
//        if(n<=1){
//            return 1;
//        }else{
//            return n * factorial(n -1);
//        }
//
//
//    }
    public static void rollDice() {
        System.out.println("How many sides?");
        int sides = scan.nextInt();
        int dice1 = (int) (Math.random() * (sides - 1) + 1);
        int dice2 = (int) (Math.random() * (sides - 1) + 1);

        boolean confirm = true;

        do{
            System.out.printf("Dice 1 rolled: %d | Dice 2 rolled : %d%n", dice1, dice2);
            System.out.println("would you like to go again? [y/n]");
            String userConfirm = scan.next();
            if(userConfirm.equalsIgnoreCase("n")) {
                confirm = false;
            }else {
                rollDice();
            }

        }while (confirm);



    }


    public static void main(String[] args) {
//        System.out.println(addition(3, 4));
//        System.out.println(subtraction(4, 3));
//        System.out.println(multiplication(3, 10));
//        System.out.println(division(4, 2));
//        System.out.println(modulus(2, 8));

//        boolean confirm = true;
//        while (confirm){
//            int userNum = getInteger(1, 10);
//            factorial(userNum);
//            System.out.println("would you like to go again? [y/n]");
//            String userConfirm = scan.next();
//            confirm = userConfirm.equalsIgnoreCase("y");
//        }


rollDice();

    }

}








