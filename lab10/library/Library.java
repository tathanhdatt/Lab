package lab10.library;

public class Library {
  protected Rent[] rents;

  public Library(Rent[] rents) {
    this.rents = rents;
  }

  public Rent getLongestRent() {
    int IndexOfLongestRent = 0;
    long longestRent = 0;
    for (int i = 0; i < this.rents.length; i++) {
      long beginDay = rents[i].getBegin().getTime();
      long endDay = rents[i].getEnd().getTime();
      long noOfDaysBetween = endDay - beginDay;
      if (longestRent < noOfDaysBetween) {
        IndexOfLongestRent = i;
        longestRent = noOfDaysBetween;
      }
    }

    return rents[IndexOfLongestRent];
  }
}
