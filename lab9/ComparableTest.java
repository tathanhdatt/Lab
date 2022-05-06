package lab9;

import java.util.*;
public class ComparableTest {
  public static void main(String[] args) {
    List<Movie> list = new ArrayList<>();
    list.add(new Movie("Force Awakens", 8.3, 2015));
    list.add(new Movie("Star Wars", 8.7, 1977));
    list.add(new Movie("Empire Strikes Back", 8.8, 1980));

    Collections.sort(list);

    System.out.println("movies after sorting: ");
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
