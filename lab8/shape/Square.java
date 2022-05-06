package lab8.shape;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double size) {
        super(size, size);
    }

    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public double getSize() {
        return super.getWidth();
    }

    public void setSize(double size) {
        super.setWidth(size);
        super.setLength(size);
    }

    public void setWidth(double size) {
        super.setWidth(size);
    }

    public void setLength(double size) {
        super.setLength(size);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + ']';
    }
}
