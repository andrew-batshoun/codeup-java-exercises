import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        //1.
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %f.\n", pi);

        //EXPLORE A SCANNER CLASS
        //1.
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a number:\n");
//        int userNum = scanner.nextInt();
//        System.out.println(userNum);

        //2.
//        System.out.println("Enter 3 words:");
//        String userStr1 = scanner.next();
//        String userStr2 = scanner.next();
//        String userStr3 = scanner.next();
//        System.out.println(userStr1 + "\n" + userStr2 + "\n" + userStr3 + "\n");


        //3.
//        System.out.println("Enter a sentence");
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);

        //Calculate the perimeter and area of Codeup's classrooms.
        System.out.println("What is the length and Width of the room?");
        String inputLength = scanner.nextLine();
        String inputWidth = scanner.nextLine();
        int length = Integer.parseInt(inputLength);
        int width = Integer.parseInt(inputWidth);
        int area = length * width;
        int perimeter = (length * 2) + (width * 2);

        System.out.format("The area is: %d sqft%nThe perimeter is: %d ft%n", area, perimeter);

    }
}

