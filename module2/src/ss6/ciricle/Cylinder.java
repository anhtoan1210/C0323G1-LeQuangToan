package ss6.ciricle;

public class Cylinder extends Ciricle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }


    public double getArea() {
        return 2*3.14*(this.height*getRadius());
    }


    public double volume() {
        return getArea()*this.height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                ", volume="+ volume()+'\''+
                ",area="+getArea()+
                '}';
    }
}
