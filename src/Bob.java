

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean later = true;
        do {
            System.out.println("What's up?");
            String convo = scanner.nextLine();
            if (convo.endsWith("?")) {
                System.out.println("Sure");
            } else if (convo.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (convo.equals("")) {
                System.out.println("Fine. Be that way!");
            } else if (convo.contains("later")) {
                System.out.println("Later");
                later = false;

            } else {
                System.out.println("Whatever.");
            }


        } while (later);

    }
}

