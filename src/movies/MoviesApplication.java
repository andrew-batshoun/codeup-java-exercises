package movies;

import util.Input;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MoviesApplication {


    public static void main(String[] args) {
        boolean confirm = true;
        do {


            Input userInput = new Input();
            MoviesArray movie = new MoviesArray();
            Movie[] movies = movie.findAll();


            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category\n6 - add a new movie");

            int choice = userInput.getInt("Enter your choice:");

            switch (choice) {
                case 0:
                    System.out.println("Till next time.");
                    confirm = false;
                    break;
                case 1:
                    for (int i = 0; i < movies.length; i++) {
                        System.out.println(movies[i].getName());
                    }
                    break;
                case 2:
                    for (int i = 0; i < movies.length; i++) {
                        if (movies[i].getCategory() == "animated") {
                            System.out.println(movies[i].getName());
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < movies.length; i++) {
                        if (movies[i].getCategory() == "drama") {
                            System.out.println(movies[i].getName());
                        }

                    }
                    break;
                case 4:
                    for (int i = 0; i < movies.length; i++) {
                        if (movies[i].getCategory() == "horror") {
                            System.out.println(movies[i].getName());
                        }

                    }
                    break;
                case 5:
                    for (int i = 0; i < movies.length; i++) {
                        if (movies[i].getCategory() == "scifi") {
                            System.out.println(movies[i].getName());
                        }
                    }
                default:
                    System.out.println("That is not a choice, try again.");

            }
        }while (confirm);
    }
}
