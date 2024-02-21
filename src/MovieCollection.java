import java.util.ArrayList;

public class MovieCollection {

    /*
    private Movie[] movieList;
    int count = 0;

    public MovieCollection() {
        this.movieList = new Movie[5];
    }

    public void addMovie (String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
    movieList[count++] = new Movie( title, director,yearCreated,isInColor,lengthInMinutes,genre);
    }

     public Movie[] getMovielist() {
        return movieList;
    }
     */

    private ArrayList<Movie> movieList = new ArrayList<>();

    public ArrayList<Movie> getMovieCollection() {
        return movieList;
    }

    public void addMovie (String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        Movie movieToAdd = new Movie(title,director,yearCreated,isInColor,lengthInMinutes,genre);
        movieList.add(movieToAdd);
    }



}
