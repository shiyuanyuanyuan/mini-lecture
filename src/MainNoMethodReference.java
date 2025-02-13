import java.util.ArrayList;
import java.util.List;
import movie.Movie;

/**
 * This class demonstrates the use of the reduce() method in Java Streams to sum
 * the release years of movies.
 */
public class MainNoMethodReference {
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

    // use for loop to sum the release years of the movies
    int totalYears = 0;
    for (Movie movie : movieList) {
      totalYears += movie.year();
    }
    // Print the total of the release years
    System.out.println("Total Years: " + totalYears);

    // TODO: Use the reduce() method in Stream API and lambda expression to sum the release years of the movies


    //TODO: Use the reduce() method and method reference to sum the release years of the movies


  }
}