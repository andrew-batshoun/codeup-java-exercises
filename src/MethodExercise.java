import java.util.Scanner;

public class MethodExercise {
    private static Scanner scan = new Scanner(System.in);
    //Basic Arithmetic

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
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
            if (userInput >= 1 && userInput <= 10) {
                System.out.println("Your number is with in range.");
                return userInput;
            } else {
                System.out.println("That is not in range.");
                return getInteger(min,max);
            }
        }
//    public static int factorial() {
//        System.out.println("Choose a number from 1 to 10.");
//        int userNum = scan.nextInt();
//        long fact = 1;
//        for (int i = 1; i <= userNum; i++) {
//            fact = fact * i;
//
//        }
//    }



    public static void main(String[] args) {
        System.out.println(addition(3, 4));
        System.out.println(subtraction(4, 3));
        System.out.println(multiplication(3, 10));
        System.out.println(division(4, 2));
        System.out.println(modulus(2, 8));
        getInteger(1,10);
    }

    }




