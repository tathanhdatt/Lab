package lab10.library;

public class Dvd extends Item {
  protected int duration;


  public Dvd(String title, int year, int duration) {
    super(title, year);
    this.duration = duration;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Dvd{");
    sb.append(super.toString());
    sb.append(", duration=").append(duration);
    sb.append('}');
    return sb.toString();
  }
}
