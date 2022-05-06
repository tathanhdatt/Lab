package lab9;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie> {
  public int compare(Movie left, Movie right) {
    return left.getName().compareToIgnoreCase(right.getName());
  }
}
