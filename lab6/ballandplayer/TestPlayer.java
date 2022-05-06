package lab6.ballandplayer;

public class TestPlayer {
  public static void main(String[] args) {
    Player player = new Player(13, 1, 1);
    player.move(1,1);
    player.jump(2);
    Ball ball = new Ball(4, 4, 0);
    System.out.println(ball);
    if (player.near(ball)) {
      player.kick(ball);
    }
    System.out.println(ball);
  }
}
