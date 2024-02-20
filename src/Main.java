import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        MovieCollection firstMovieCollection = new MovieCollection();

        System.out.println("Insert name of the movie title:");
        String title = input.nextLine();
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

        firstMovieCollection.addMovie(title,director,yearCreated,isInColor,lengthInMinutes,genre);

        }

    }
