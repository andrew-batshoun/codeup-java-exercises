package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public String getString() {
        System.out.println("Enter a string");
        String string = scanner.next();
        System.out.println(string);
        return string;
    }

    public String getString(String str) {
        System.out.println(str);
        String string = scanner.next();
        System.out.println(string);
        return string;
    }


    public boolean yesNo() {
        System.out.println("Enter yes or no.");
        String yes = scanner.next().trim();
        if (yes.equalsIgnoreCase("y") || yes.equalsIgnoreCase("yes")) {

            return true;
        } else {
            return false;
        }
    }

    public boolean yesNo(String str) {
        System.out.println(str);
        System.out.println("Enter yes or no.");
        String yes = scanner.next().trim();
        if (yes.equalsIgnoreCase("y") || yes.equalsIgnoreCase("yes")) {

            return true;
        } else {

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
    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt);
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

    public int getInt(String Str) {

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
public Double getDouble(String prompt, Double min, Double max) {
        System.out.printf(prompt);
        Double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max) {
            System.out.println("Your number is with in range.");
            return userInput;
        } else {
            System.out.println("That is not in range.");
            return getDouble(prompt, min, max);
        }
    }

    public Double getDouble() {
        System.out.println("Enter a number");
        Double num = scanner.nextDouble();
        System.out.println(num);
        return num;
    }

    public Double getDouble(String str) {
        Double num = scanner.nextDouble();
        System.out.println(num);
        return num;
    }
}
