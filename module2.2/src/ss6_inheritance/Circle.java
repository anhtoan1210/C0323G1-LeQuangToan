package ss6_inheritance;

public abstract class Circle {
    //Thành phần private không thể kế thừa.
    public double darius;
    private String color;

    public Circle() {
    }

    //Không thể kế thừa contructor;
    public Circle(double darius, String color) {
        this.darius = darius;
        this.color = color;
    }

    public double getDarius() {
        return darius;
    }

    public void setDarius(double darius) {
        this.darius = darius;
    }

    public String getColor() {
        return color;
    }

    //Kế thừa được phương thức getArea;
    public double getArea() {
        return this.darius * this.darius * 3.14;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "darius=" + darius +
                ", color='" + color + '\'' +
                '}';
    }
}
