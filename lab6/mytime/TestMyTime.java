package lab6.mytime;

public class TestMyTime {
  public static void main(String[] args) {
    // Test constructors and toString()
    MyTime time = new MyTime(1, 2, 3);
    System.out.println(time);

    // Test setters and getters
    time.setHour(4);
    time.setMinute(5);
    time.setSecond(6);
    System.out.println(time);
    System.out.println("Hour: " + time.getHour());
    System.out.println("Minute: " + time.getMinute());
    System.out.println("Second: " + time.getSecond());

    // Test setTime()
    time.setTime(23, 59, 58);
    System.out.println(time);

    // Test next...()
    System.out.println("Next second");
    System.out.println(time.nextSecond());
    System.out.println(time.nextSecond().nextSecond());
    System.out.println("Next minute");
    System.out.println(time.nextMinute());
    System.out.println(time.nextMinute().nextMinute());
    System.out.println("Next hour");
    System.out.println(time.nextHour());
    System.out.println(time.nextHour().nextHour());

    // Test previous...()
    System.out.println("Pre second");
    System.out.println(time.previousSecond());
    System.out.println(time.previousSecond().previousSecond());
    System.out.println("Pre minute");
    System.out.println(time.previousMinute());
    System.out.println(time.previousMinute().previousMinute());
    System.out.println("Pre hour");
    System.out.println(time.previousHour());
    System.out.println(time.previousHour().previousHour());
  }
}
