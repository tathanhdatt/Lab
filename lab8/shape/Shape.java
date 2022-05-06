package lab8.shape;

public abstract class Shape {
    protected String color;
    protected Boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "AbstractShape[" +
                "color=" + color +
                ", filled=" + filled +
                ']';
    }

}
