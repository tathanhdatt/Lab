package lab9;

public class Movie implements  Comparable<Movie>{
  private String name;
  private double rating;
  private int year;

  public int compareTo(Movie movie) {
    if (this.getYear() < movie.getYear()) {
      return -1;
    } else if (this.getYear() > movie.getYear()) {
      return 1;
    } else {
      return 0;
    }
  }

  public Movie(String name, double rating, int year) {
    this.name = name;
    this.rating = rating;
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public double getRating() {
    return rating;
  }

  public int getYear() {
    return year;
  }
}
