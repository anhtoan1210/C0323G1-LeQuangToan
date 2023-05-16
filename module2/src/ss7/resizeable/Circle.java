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
        double areaCircle = getArea() + (getArea() * percent / 100);
        System.out.println("Diện tích sau khi tăng kích thước theo tỉ lệ phần trăm là: "+areaCircle);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + getArea() +

                '}';
    }
}
