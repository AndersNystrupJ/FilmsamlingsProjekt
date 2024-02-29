import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class MovieCollection {
    Scanner scan = new Scanner(System.in);

    private ArrayList<Movie> movieList = new ArrayList<>();

    public ArrayList<Movie> getMovieCollection() {
        return movieList;
    }


    public void addMovie(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        Movie movieToAdd = new Movie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
        movieList.add(movieToAdd);
    }

    public void seeMovieList() {
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println("Movie titel: " + movieList.get(i).getTitle());
            System.out.println("Director: " + movieList.get(i).getDirector());
            System.out.println("Year created: " + movieList.get(i).getYearCreated());
            if (movieList.get(i).getIsInColor()) {
                System.out.println("Movie in color: yes");
            } else {
                System.out.println("Movie in color: no");
            }
            System.out.println("Movie length: " + movieList.get(i).getLengthInMinutes() + " minutes");
            System.out.println("Movie genre: " + movieList.get(i).getGenre());
            System.out.println();
        }
    }

    public void searchMovie(String title) {
        ArrayList<Movie> searchMovieResult = new ArrayList<>();
        for (Movie movie : movieList) {
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                searchMovieResult.add(movie);
            }
        }
        if (searchMovieResult.isEmpty()) {
            System.out.println("Movie collection does not contain a movie of that title");
        } else {
            for (Movie searchMovieTitle : searchMovieResult) {
                System.out.println(searchMovieTitle.getTitle());
            }
        }
    }

    public void editMovie() {
        System.out.println("Enter titel of the movie you want to edit");
        String title = scan.nextLine();
        for (Movie movie : movieList) {
            if (movie.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println("What do you want to edit?");
                System.out.println("1. Edit title");
                System.out.println("2. Edit director");
                System.out.println("3. Edit year created");
                System.out.println("4. Edit movie color");
                System.out.println("5. Edit movie length");
                System.out.println("6. Edit movie genre");
                System.out.println("7. Delete movie from movie collection");
                int editChoice = scan.nextInt();
                if (editChoice == 1) {
                    System.out.println("Edit title:");
                    scan.nextLine();
                    movie.setTitle(scan.nextLine());
                } else if (editChoice == 2) {
                    System.out.println("Edit director:");
                    scan.nextLine();
                    movie.setDirector(scan.nextLine());
                } else if (editChoice == 3) {
                    System.out.println("Edit year created:");
                    scan.nextLine();
                    movie.setYearCreated(scan.nextInt());
                } else if (editChoice == 4) {
                    while (true) {
                        try {
                            System.out.println("Edit if the movie is in color or not (true/false):");
                            scan.nextLine();
                            movie.setInColor(scan.nextBoolean());
                            break;
                        } catch (InputMismatchException ime) {
                            System.out.println("Input is not valid. Try again.");
                        }
                    }
                } else if (editChoice == 5) {
                    System.out.println("Edit movie length in minutes:");
                    scan.nextLine();
                    movie.setLengthInMinutes(scan.nextInt());
                } else if (editChoice == 6) {
                    System.out.println("Edit the genre of the movie:");
                    scan.nextLine();
                    movie.setGenre(scan.nextLine());
                } else if (editChoice == 7) {
                    movieList.remove(movie);
                }

                System.out.println("Movie details was updated successfully");

                break;
            }
                System.out.println("Your movie collection does not contain a movie of the titel " + title);




        }
    }
}