import java.util.ArrayList;
import java.util.List;
import movie.Movie;

/**
 * This class demonstrates the use of lambda expressions in Java for sorting and iterating
 * over a list of movies.
 */
public class MainLambda {
  /**
   * The main method that serves as the entry point of the application.
   * It creates a list of movies, sorts them by title using a lambda expression,
   * and prints the sorted list.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    // Create a list of movies
    List<Movie> movieList = new ArrayList<>();
    movieList.add(new Movie("The Matrix", 1999));
    movieList.add(new Movie("Inception", 2010));
    movieList.add(new Movie("Interstellar", 2014));

    // Sort the list of movies by title using a lambda expression
    movieList.sort((m1, m2) -> m1.title().compareTo(m2.title()));

    // Iterate over the sorted list and print the title of each movie
    movieList.forEach(movie -> System.out.println(movie.title()));
  }
}