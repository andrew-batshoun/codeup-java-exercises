package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap <String, Student> students = new HashMap<>();
        Student Yvette = new Student("Yvette");
        Yvette.addGrade(87);
        Yvette.addGrade(93);
        Yvette.addGrade(91);
        Student Brooke = new Student("Brooke");
        Brooke.addGrade(97);
        Brooke.addGrade(95);
        Brooke.addGrade(93);
        Student Frances = new Student("Frances");
        Frances.addGrade(76);
        Frances.addGrade(95);
        Frances.addGrade(83);
        Student Guapo = new Student("Guapo");
        Guapo.addGrade(88);
        Guapo.addGrade(90);
        Guapo.addGrade(98);
        students.put("colorfulpod95", Yvette);
        students.put("privatething58", Brooke);
        students.put("saltycompany25", Frances);
        students.put("pinkbed40", Guapo);



        Scanner scan = new Scanner(System.in);
        boolean confirm;
        do {
            System.out.println("Welcome!");
            System.out.println();
            System.out.println("Here are the GitHub usernames of our students:");
            System.out.println();
            System.out.println("|colorfulpod95|   |privatethings58|   |saltycompany25|   |pinkbed40|");
            System.out.println();
            System.out.println("What student would you like to see more information on?");
            String userSelect = scan.next().trim();
            switch (userSelect){
                case "colorfulpod95":
                    System.out.printf("\nName: %s - Github Username: colorfulpod95\n", Yvette.getName());
                    System.out.printf("Current Average: %.2f\n", Yvette.getGradeAverage());
                    break;
                case "privatethings58":
                    System.out.printf("\nName: %s - Github Username: privatethings58\n", Brooke.getName());
                    System.out.printf("Current Average: %.2f\n", Brooke.getGradeAverage());
                    break;
                    case "saltycompany25":
                    System.out.printf("\nName: %s - Github Username: saltycompany25\n", Frances.getName());
                    System.out.printf("Current Average: %.2f\n", Frances.getGradeAverage());
                    break;
                    case "pinkbed40":
                    System.out.printf("\nName: %s - Github Username: pinkbed40\n", Guapo.getName());
                    System.out.printf("Current Average: %.2f\n", Guapo.getGradeAverage());
                    break;
                default:
                    scan.next();
                    System.out.println("Sorry, no student found with the username of " + userSelect);

            }
            System.out.println("Would you like to see another student?");
            String userInput = scan.next().trim();
            confirm = userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
        }while(confirm);



    }
}
