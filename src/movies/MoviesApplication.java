package movies;
import util.Input;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    private static Scanner scan = new Scanner(System.in);

public static Movie[] addMovie(Movie[] array, Movie length){
    System.out.println("What is the name of the movie?");
    String userMovie = scan.nextLine();
    System.out.println("What category is the movie?\nhorror\nanimated\nscifi\ndrama\nmusical");
    String userCat = scan.nextLine();
    Movie newMovie = new Movie(userMovie, userCat);
    Movie[] newArray = Arrays.copyOf(array, array.length + 1);
    newArray[newArray.length - 1] = newMovie;
   return newArray;
}

    public static void main(String[] args) {
        boolean confirm = true;
        do {


            Input userInput = new Input();
            MoviesArray movie = new MoviesArray();
            Movie[] movies = movie.findAll();
            Movie addedMovie = new Movie();


            System.out.println("What would you like to do?");
            System.out.println();
            System.out.println("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category");

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
