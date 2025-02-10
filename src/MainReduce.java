import java.util.ArrayList;
import java.util.List;
import movie.Movie;

/**
 * This class demonstrates the use of the reduce() method in Java Streams to sum
 * the release years of movies.
 */
public class MainReduce {
  /**
   * The main method that serves as the entry point of the application.
   * It creates a list of movies, uses the reduce() method to sum their release years,
   * and prints the total.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    // Create a list of movies
    List<Movie> movieList = new ArrayList<>();
    movieList.add(new Movie("The Matrix", 1999));
    movieList.add(new Movie("Inception", 2010));
    movieList.add(new Movie("Interstellar", 2014));

    // Use the reduce() method to sum the release years of the movies
    int totalYears = movieList.stream()
        .map(Movie::year)
        .reduce(0, Integer::sum);

    // Print the total of the release years
    System.out.println("Total Years: " + totalYears);
  }
}