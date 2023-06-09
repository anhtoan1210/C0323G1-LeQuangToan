package ss7.resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (this.radius * this.radius) * 3.14;
    }

    @Override
    public void resize(double percent) {
        setRadius(getRadius() + (getRadius() * percent / 100));
        System.out.println("Bán kinh sau khi thay đỏi là: " + radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + getArea() +

                '}';
    }
}
