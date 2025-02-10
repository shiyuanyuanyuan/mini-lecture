package movie;

/**
 * This class represents a movie.Movie with a title and release year.
 */
public record Movie(String title, int year) {
  /**
   * Constructor to initialize a movie.Movie object.
   *
   * @param title the title of the movie
   * @param year  the release year of the movie
   */
  public Movie {
  }

  /**
   * Gets the title of the movie.
   *
   * @return the title of the movie
   */
  @Override
  public String title() {
    return title;
  }

  /**
   * Gets the release year of the movie.
   *
   * @return the release year of the movie
   */
  @Override
  public int year() {
    return year;
  }
}