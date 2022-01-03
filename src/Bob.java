

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean later;
        do {
            System.out.println("What's up?");
            String convo = scanner.nextLine();
            if (convo.endsWith("?")) {
                System.out.println("Sure");
            } else if (convo.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (convo.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Anything else?");
            String answer = scanner.nextLine();
            later = answer.equalsIgnoreCase("yes");

        }while(later);

        }
    }

