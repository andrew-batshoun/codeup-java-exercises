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


//    public int getInt() {
//        System.out.println("Enter a number");
//        int num = scanner.nextInt();
//        System.out.println(num);
//
//        return num;
//    }
    public int getInt() {
        System.out.println("Enter a number");
        try {
            String num = scanner.next();
            return Integer.valueOf(num);
        }catch(NumberFormatException e){
            System.out.println("\nThat is not a number. Please try again.");
        }
       return getInt();

    }

    public int getInt(String Str) {
        System.out.println(Str);
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

//    public Double getDouble() {
//        System.out.println("Enter a number");
//        Double num = scanner.nextDouble();
//        System.out.println(num);
//        return num;
//    }

    public Double getDouble() {
        System.out.println("Enter a number");
        try {
            String num = scanner.next();
            return Double.valueOf(num);
        }catch(NumberFormatException e){
            System.out.println("\nThat is not a number. Please try again.");
        }
        return getDouble();
    }

    public Double getDouble(String str) {
        Double num = scanner.nextDouble();
        System.out.println(num);
        return num;
    }

//    public Integer getBinary(){
//        System.out.println("Enter a binary number");
//        try {
//            String num = scanner.next();
//            Integer binaryNum = Integer.valueOf(num, 2);
//            System.out.println(binaryNum);
//            return binaryNum;
//        }catch(NumberFormatException e){
//            System.out.println("\nThat is not a binary number. Please try again.");
//        }
//        return getBinary();
//    }
public Integer getBinary() {
        String num = getString("Enter a binary Num:");
        try {
            Integer binaryNum = Integer.valueOf(num, 2);
            System.out.println(binaryNum);
            return binaryNum;
        }catch(NumberFormatException e){
            System.out.println("\nThat is not a binary number. Please try again.");
        }
        return getBinary();
}

    public Integer getHex(){
        System.out.println("Enter a Hex number");
        try {
            String num = scanner.next();
            Integer hexNum = Integer.valueOf(num, 16);
            System.out.println(hexNum);
            return hexNum;
        }catch(NumberFormatException e){
            System.out.println("\nThat is not a Hex number. Please try again.");
        }
        return getHex();

    }
}
