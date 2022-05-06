package lab8.resizable;

public class ResizableCircle extends Circle implements Resizable {

  public ResizableCircle(double radius) {
    super(radius);
  }

  public String toString() {
    return "ResizableCircle[" + super.toString() + ']';
  }

  @Override
  public void resize(int percent) {
    super.radius *= percent / 100.0;
  }
}
