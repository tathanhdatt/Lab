package lab6.mydate;

public class MyDate {
  private int year;
  private int month;
  private int day;

  public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
    "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

  public static final String[] DAYS = {"Sunday", "Monday", "Tuesday",
    "Wednesday", "Thursday", "Friday", "Saturday"};

  public static final int[] DAYS_IN_MONTHS = {
    31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
  };

  public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  }

  public static boolean isValidDate(int year, int month, int day) {
    // check year
    if (9999 < year || year < 1) {
      return false;
    }

    // check month
    if (12 < month || month < 0) {
      return false;
    }

    // check day
    if (day <= 0) {
      return false;
    } else {
      if (isLeapYear(year) && month == 2) {
        return day <= 29;
      } else {
        return day <= DAYS_IN_MONTHS[month - 1];
      }
    }
  }

  public static int getDayOfWeek(int year, int month, int day) {
    int date = 0;

    int[] numFollowCentury = {6, 4, 2, 0};
    int first2DigitOfYear = year / 100;
    if ((first2DigitOfYear - 20) % 4 == 0) {
      date += numFollowCentury[0];
    } else if ((first2DigitOfYear - 21) % 4 == 0) {
      date += numFollowCentury[1];
    } else if ((first2DigitOfYear - 22) % 4 == 0) {
      date += numFollowCentury[2];
    } else if ((first2DigitOfYear - 23) % 4 == 0) {
      date += numFollowCentury[3];
    }

    int last2DigitOfYear = year % 100;
    date += last2DigitOfYear + last2DigitOfYear / 4;

    int[] numMonthNonLeapYear = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    int[] numMonthLeapYear = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    date += isLeapYear(year) ?
      numMonthLeapYear[month - 1] :
      numMonthNonLeapYear[month - 1];
    date += day;

    return date % 7;
  }

  public MyDate(int year, int month, int day) {
    this.setYear(year);
    this.setMonth(month);
    this.setDay(day);
  }

  public void setDate(int year, int month, int day) throws IllegalArgumentException {
    if (isValidDate(year, month, day)) {
      throw new IllegalArgumentException("Invalid year, month or day!");
    }
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) throws IllegalArgumentException {
    if (9999 < year || year < 0) {
      throw new IllegalArgumentException("Invalid year!");
    }
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) throws IllegalArgumentException {
    if (12 < month || month < 0) {
      throw new IllegalArgumentException("Invalid month!");
    }
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) throws IllegalArgumentException{
    if (isLeapYear(this.year) && this.month == 2) {
      if (29 < day || day < 0) {
        throw new IllegalArgumentException("Invalid day!");
      }
    }

    if (DAYS_IN_MONTHS[this.month - 1] < day || day < 0) {
      throw new IllegalArgumentException("Invalid day!");
    }

    this.day = day;
  }

  @Override
  public String toString() {
    return DAYS[getDayOfWeek(this.year, this.month, this.day)] + " " + day + " " +
      MONTHS[this.month - 1] + " " + year;
  }

  public MyDate nextDay() {
    // Day
    if (isLeapYear(this.year) && this.month == 2) {
      this.day = this.day == 29 ? 1 : this.day + 1;
    } else {
      this.day = this.day == DAYS_IN_MONTHS[this.month - 1] ? 1 : this.day + 1;
    }

    // Month
    if (this.day == 1) {
      this.nextMonth();
    }

    return this;
  }

  public MyDate nextMonth() {
    // Day
    if (this.month < 12 && this.day == DAYS_IN_MONTHS[this.month - 1]) {
      if (DAYS_IN_MONTHS[this.month - 1] != DAYS_IN_MONTHS[this.month]) {
        this.day = DAYS_IN_MONTHS[this.month];
      }
    }

    // Month
    this.month = this.month == 12 ? 1 : this.month + 1;

    //Year
    if (this.month == 1) {
      this.nextYear();
    }

    return this;
  }

  public MyDate nextYear() throws IllegalArgumentException {
    if (this.year == 9999) {
      throw new IllegalArgumentException("Year out of range!");
    }
    if (isLeapYear(this.year) && this.day == 29) {
      this.day = 28;
    }
    this.year += 1;

    return this;
  }

  public MyDate previousDay() {
    // Day
    if (isLeapYear(this.year) && this.month == 3) {
      this.day = this.day == 1 ? 29 : this.day - 1;
    } else {
      this.day = this.day == 1 ? DAYS_IN_MONTHS[this.month - 1] : this.day - 1;
    }

    // Month
    if (this.day == DAYS_IN_MONTHS[this.month - 1]) {
      this.previousMonth();
    }

    return this;
  }

  public MyDate previousMonth() {
    // Day
    if (this.month > 1 && this.day == DAYS_IN_MONTHS[this.month - 1]) {
      if (DAYS_IN_MONTHS[this.month - 1] != DAYS_IN_MONTHS[this.month - 2]) {
        this.day = DAYS_IN_MONTHS[this.month - 2];
      }
    }

    // Month
    this.month = this.month == 1 ? 12 : this.month - 1;

    // Year
    if (this.month == 12) {
      this.previousYear();
    }

    return this;
  }

  public MyDate previousYear() throws IllegalArgumentException {
    if (this.year == 1) {
      throw new IllegalArgumentException("Year out of range!");
    }
    if (isLeapYear(this.year) && this.day == 29) {
      this.day = 28;
    }
    this.year -= 1;

    return this;
  }
}
