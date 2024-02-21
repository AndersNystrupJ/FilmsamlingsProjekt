import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to my moviecollection");
            System.out.println("1. Add a new movie");
            System.out.println("2. Exit");
            int menuChoice = input.nextInt();
            if (menuChoice == 1) {
                System.out.println("Insert name of the movie title:");
                String title = input.nextLine();
                input.nextLine();
                System.out.println("Insert name of the movie director:");
                String director = input.nextLine();
                System.out.println("Insert the year movie was created:");
                int yearCreated = input.nextInt();
                System.out.println("Is the movie in color? Insert \"true\" or \"false\":");
                boolean isInColor = input.nextBoolean();
                System.out.println("Insert movie length in minutes:");
                int lengthInMinutes = input.nextInt();
                System.out.println("Insert name of the movie-genre:");
                String genre = input.nextLine();
                input.nextLine(); // for at fikse "the scanner-bug" - springer ikke en linje tekst/input over.

                controller.addMovieToMovieList(title,director,yearCreated,isInColor,lengthInMinutes,genre);
            }

               else if (menuChoice == 2) {
                   break;
            }
        }

        }

    }
