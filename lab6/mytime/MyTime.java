package lab6.mytime;

public class MyTime {
  private int hour;
  private int minute;
  private int second;

  public MyTime() {
    this.hour = 0;
    this.minute = 0;
    this.second = 0;
  }

  public MyTime(int hour, int minute, int second) {
    this.setHour(hour);
    this.setMinute(minute);
    this.setSecond(second);
  }

  public void setTime(int hour, int minute, int second) throws IllegalArgumentException {
    if (
            23 < this.hour || this.hour < 0 ||
            59 < this.minute || this.minute < 0 ||
            59 < this.second || this.second < 0
    ) {
      throw new IllegalArgumentException("Invalid hour, minute or second!");
    }
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) throws IllegalArgumentException {
    if (23 < this.hour || this.hour < 0) {
      throw new IllegalArgumentException("Invalid hour!");
    }
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) throws IllegalArgumentException {
    if (59 < this.minute || this.minute < 0) {
      throw new IllegalArgumentException("Invalid minute!");
    }
    this.minute = minute;
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) throws IllegalArgumentException {
    if (59 < this.second || this.second < 0) {
      throw new IllegalArgumentException("Invalid second!");
    }
    this.second = second;
  }

  @Override
  public String toString() {
    String hour = this.hour < 10 ? ("0" + this.hour) : String.valueOf(this.hour);
    String minute = this.minute < 10 ? ("0" + this.minute) : String.valueOf(this.minute);
    String second = this.second < 10 ? ("0" + this.second) : String.valueOf(this.second);
    return String.format("%s:%s:%s", hour, minute, second);
  }

  public MyTime nextSecond() {
    this.second = (this.second == 59) ? 0 : (this.second + 1);
    if (this.second == 0) {
      this.nextMinute();
    }

    return this;
  }

  public MyTime nextMinute() {
    this.minute = this.minute == 59 ? 0 : this.minute + 1;
    if (this.minute == 0) {
      this.nextHour();
    }

    return this;
  }

  public MyTime nextHour() {
    this.hour = this.hour == 23 ? 0 : this.hour + 1;
    return this;
  }

  public MyTime previousSecond() {
    second = (second == 0) ? 59 : (second - 1);
    if (second == 59) {
      this.previousMinute();
    }

    return this;
  }

  public MyTime previousMinute() {
    this.minute = this.minute == 0 ? 59 : this.minute - 1;
    if (this.minute == 59) {
      this.previousHour();
    }

    return this;
  }

  public MyTime previousHour() {
    this.hour = this.hour == 0 ? 23 : this.hour - 1;
    return this;
  }
}
