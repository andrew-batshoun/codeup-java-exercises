package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public String getString() {
        System.out.println("Enter a string");
        String string = scanner.next();
        System.out.println(string);
        return string;
    }

    public boolean yesNo() {
        System.out.println("Enter yes or no.");
        String yes = scanner.next();
        if (yes.equalsIgnoreCase("y") || yes.equalsIgnoreCase("yes")) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("Your number is with in range.");
            return userInput;
        } else {
            System.out.println("That is not in range.");
            return getInt(min, max);
        }

    }

    public int getInt() {
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        System.out.println(num);

        return num;
    }

    public Double getDouble(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        Double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            System.out.println("Your number is with in range.");
            return userInput;
        } else {
            System.out.println("That is not in range.");
            return getDouble(min, max);
        }
    }
        public Double getDouble () {
            System.out.println("Enter a number");
            Double num = scanner.nextDouble();
            System.out.println(num);
            return num;
        }
    }
