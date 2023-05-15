package ss6.ciricle;

public class Ciricle {
    private double radius;
    private String color;

    public Ciricle() {
    }

    public Ciricle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
public double getArea(){
        return (this.radius*this.radius)*3.14;
}
    @Override
    public String toString() {
        return "Ciricle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area =" + getArea() +
                '}';
    }
}
