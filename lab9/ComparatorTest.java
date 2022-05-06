package lab9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest {
  public static void main(String[] args) {
    List<Movie> list = new ArrayList<>();
    list.add(new Movie("Force Awakens", 8.3, 2015));
    list.add(new Movie("Star Wars", 8.7, 1977));
    list.add(new Movie("Empire Strikes Back", 8.8, 1980));

    System.out.println("Sorted by rating:");
    RatingCompare ratingCompare = new RatingCompare();
    Collections.sort(list, ratingCompare);

    for (Movie movie:
            list) {
      System.out.println(
              movie.getName() + " "
                      + movie.getYear() + " "
                      + movie.getRating()
      );
    }

    System.out.println("\nSorted by name:");
    NameCompare nameCompare = new NameCompare();
    Collections.sort(list, nameCompare);
    for (Movie movie:
            list) {
      System.out.println(
              movie.getName() + " "
                      + movie.getYear() + " "
                      + movie.getRating()
      );
    }

  }
}
