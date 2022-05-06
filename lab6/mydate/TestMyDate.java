package lab6.mydate;

public class TestMyDate {
  public static void main(String[] args) {
    MyDate date1 = new MyDate(2012, 2, 28);
    System.out.println(date1);
    System.out.println(date1.nextDay());
    System.out.println(date1.nextDay());
    System.out.println(date1.nextMonth());
    System.out.println(date1.nextYear());

    MyDate date2 = new MyDate(2012, 1, 2);
    System.out.println(date2);
    System.out.println(date2.previousDay());
    System.out.println(date2.previousDay());
    System.out.println(date2.previousMonth());
    System.out.println(date2.previousYear());


    // MyDate date3 = new MyDate(2012, 2, 29);
    // System.out.println(date3.previousYear());

    System.out.println("\nDates from 28 Dec 2011 to 2 Mar 2012");
    MyDate date = new MyDate(2011, 12, 28);
    while (date.getDay() != 2 || date.getMonth() != 3 || date.getYear() != 2012) {
      System.out.println(date);
      date.nextDay();
    }
  }
}
