package lab8.movable;

public class Test {
  public static void main(String[] args) {
    Movable movable1 = new MovablePoint(5, 6, 10, 15);
    System.out.println(movable1);
    movable1.moveLeft();
    System.out.println(movable1);

    Movable movable2 = new MovableCircle(1, 2, 3, 4, 20);
    System.out.println(movable2);
    movable2.moveRight();
    System.out.println(movable2);
  }
}
