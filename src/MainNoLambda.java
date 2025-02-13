import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import movie.Movie;

/**
 * This class demonstrates sorting a list of movies without using lambda expressions.
 */
public class MainNoLambda {
  /**
   * The main method that serves as the entry point of the application.
   * It creates a list of movies, sorts them by title using an anonymous class, and prints the sorted list.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    // Create a list of movies
    List<Movie> movieList = new ArrayList<>();
    movieList.add(new Movie("The Matrix", 1999));
    movieList.add(new Movie("Inception", 2010));
    movieList.add(new Movie("Interstellar", 2014));

    // Traditional named class
    class MovieComparator implements Comparator<Movie> {
      @Override
      public int compare(Movie m1, Movie m2) {
        return m1.title().compareTo(m2.title());
      }
    }
    movieList.sort(new MovieComparator());

    // Iterate over the sorted list and print the title of each movie
    for (Movie movie : movieList) {
      System.out.println(movie.title());
    }

    //TODO: Sort the list of movies by title using an anonymous class


    //TODO: Sort the list of movies by year using lambda expression


    // TODO:Iterate over the sorted list and print the year of each movie with a lambda expression using .forEach()


  }
}