package lab10.library;

import java.util.StringJoiner;

public abstract class Item {

  protected String title;
  protected int year;

  public Item(String title, int year) {
    this.title = title;
    this.year = year;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Item{");
    sb.append("title='").append(title);
    sb.append(", year=").append(year);
    sb.append('}');
    return sb.toString();
  }
}