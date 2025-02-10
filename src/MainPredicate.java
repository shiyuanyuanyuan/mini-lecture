import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import movie.Movie;

/**
 * This class demonstrates the use of Predicate functional interface in Java.
 */
public class MainPredicate {
  /**
   * The main method.
   *
   * @param args
   */
  public static void main(String[] args) {
    // Create a list of movies
    List<Movie> movieList = new ArrayList<>();
    movieList.add(new Movie("The Matrix", 1999));
    movieList.add(new Movie("Inception", 2010));
    movieList.add(new Movie("Interstellar", 2014));

    // Define a Predicate to filter classic movies (released before 2000)
    Predicate<Movie> isClassic = movie -> movie.year() < 2000;

    // Use the Predicate to filter and print classic movies
    movieList.stream()
        .filter(isClassic)
        .forEach(movie -> System.out.println(movie.title()));
  }
}

