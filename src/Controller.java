public class Controller {

    private MovieCollection movieList = new MovieCollection();

    public void addMovieToMovieList(String title, String director, int yearCreated, boolean isInColor, int lengthInMinutes, String genre) {
        movieList.addMovie(title, director, yearCreated, isInColor, lengthInMinutes, genre);
    }

    public void seeMovieListInMovieList() {
        movieList.seeMovieList();
    }

    public void searchMovieInMovieList(String title) {
        movieList.searchMovie(title);
    }
    public void editMovieInMovieList() {
        movieList.editMovie();
    }

    }