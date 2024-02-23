import java.util.ArrayList;

public class MovieCollection {

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
}