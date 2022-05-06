package lab6.ballandplayer;

public class Player {
  private int number;
  private float x;
  private float y;
  private float z = 0.0f;

  public Player(int number, float x, float y) {
    this.number = number;
    this.x = x;
    this.y = y;
  }

  public void move(float xDisp, float yDisp) {
    this.x += xDisp;
    this.y += yDisp;
  }

  public void jump(float zDisp) {
    this.z += zDisp;
  }

  public boolean near(Ball ball) {
    double xDiff = this.x - ball.getX();
    double yDiff = this.y - ball.getY();
    double zDiff = this.z - ball.getZ();
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff + zDiff * zDiff) < 8;
  }

  public void kick(Ball ball) {
    ball.setXYZ(ball.getX() + 10, ball.getY() + 10, ball.getZ() + 2);
  }
}
