package lab8.resizable;

public class TestResizableCircle {
  public static void main(String[] args) {
    System.out.println("Before resize");
    ResizableCircle resizableCircle = new ResizableCircle(5.0);
    System.out.println(resizableCircle);
    System.out.println("Perimeter: " + resizableCircle.getPerimeter());
    System.out.println("Area: " + resizableCircle.getArea());

    resizableCircle.resize(50);
    System.out.println("After size");
    System.out.println(resizableCircle);
    System.out.println("Perimeter: " + resizableCircle.getPerimeter());
    System.out.println("Area: " + resizableCircle.getArea());
  }
}
