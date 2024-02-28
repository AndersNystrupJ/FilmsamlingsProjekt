import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MovieCollectionTest {

    //Test med en film:
    /*
    @Test
    void addMovie() {
        MovieCollection testCollection = new MovieCollection();
        testCollection.addMovie("Shrek", "Dreamworks", 2001, true, 90, "animation");
        int actualSize = testCollection.getMovieCollection().size();

        int expectedSize = 1;
        assertEquals(expectedSize,actualSize);
    }
     */


    // Test med to film:
    /*
    @Test
    void addMovie() {
        MovieCollection testCollection = new MovieCollection();
        testCollection.addMovie("Shrek", "Dreamworks", 2001, true, 90, "Animation");
        testCollection.addMovie("Terminator 2: Judgment Day", "James Cameron", 1991, true, 137, "Action/Sci-fi");
        int actualSize = testCollection.getMovieCollection().size();

        int expectedSize = 2;
        assertEquals(expectedSize,actualSize);
    }

     */

    //Test med nul film:
    @Test
    void addMovie() {
        MovieCollection testCollection = new MovieCollection();
        int actualSize = testCollection.getMovieCollection().size();

        int expectedSize = 0;
        assertEquals(expectedSize,actualSize);
    }
}