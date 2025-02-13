import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import movie.Movie;

/**
 * This class demonstrates the use of Predicate functional interface in Java.
 */
public class MainNoStream {
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

    // Using anonymous class instead of lambda to express the Predicate
    Predicate<Movie> isClassic = new Predicate<Movie>() {
        @Override
        public boolean test(Movie movie) {
            return movie.year() < 2000;
        }
    };

    //TODO: Use the lambda expression to filter and print classic movies (released before 2000)



    // Use the Predicate to filter and print classic movies (released before 2000)
    for (Movie movie : movieList) {
      if (isClassic.test(movie)) {
          System.out.println(movie.title());
      }
    }

    //TODO: use .forEach() to print classic movies (released before 2000)
    

    //TODO: Use the Stream API to directlyfilter and print classic movies (released before 2000)

    
  }
}

