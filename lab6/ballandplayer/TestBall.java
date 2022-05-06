package lab6.ballandplayer;

public class TestBall {
  public static void main(String[] args) {
    Ball ball = new Ball(1, 2, 3);
    System.out.println(ball);

    ball.setXYZ(3, 2, 1);
    System.out.println("x: " + ball.getX());
    System.out.println("y: " + ball.getY());
    System.out.println("z: " + ball.getZ());
  }
}
