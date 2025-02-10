import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import movie.Movie;

/**
 * This class demonstrates the use of Java Streams for filtering and collecting movies.
 */
public class MainStreams {
  /**
   * The main method that serves as the entry point of the application.
   * It creates a list of movies, filters them to find classics (released before 2000),
   * and prints the titles of the classic movies.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    // Create a list of movies
    List<Movie> movieList = new ArrayList<>();
    movieList.add(new Movie("The Matrix", 1999));
    movieList.add(new Movie("Inception", 2010));
    movieList.add(new Movie("Interstellar", 2014));

    // Use Java Streams to filter the list of movies and collect classics (released before 2000)
    List<Movie> classics = movieList.stream()
        .filter(movie -> movie.year() < 2000)
        .collect(Collectors.toList());

    // Iterate over the list of classic movies and print the title of each movie
    classics.forEach(movie -> System.out.println(movie.title()));
  }
}