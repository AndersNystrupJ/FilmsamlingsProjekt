import java.util.Scanner;

public class UserInterface {

    public void startProgram() {
        Controller controller = new Controller();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to your movie collection");
            System.out.println("1. Add a new movie");
            System.out.println("2. See list of movies");
            System.out.println("3. Search for a movie");
            System.out.println("4. Edit movie");
            System.out.println("5. Exit");
            int menuChoice = input.nextInt();
            if (menuChoice == 1) {
                System.out.println("Insert name of the movie title:");
                input.nextLine();
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
                input.nextLine();
                String genre = input.nextLine();

                controller.addMovieToMovieList(title, director, yearCreated, isInColor, lengthInMinutes, genre);

                System.out.println("Your movie has been added");
            } else if (menuChoice == 2) {
                controller.seeMovieListInMovieList();

            } else if (menuChoice == 3) {
                input.nextLine();
                System.out.println("Search for title:");
                String title = input.nextLine();
                controller.searchMovieInMovieList(title);

            } else if (menuChoice == 4) {
                controller.editMovieInMovieList();

            } else if (menuChoice == 5) {
                break;
            }
        }
    }
}
