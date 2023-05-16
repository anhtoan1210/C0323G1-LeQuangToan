package ss7.colorable;

public class Square extends Shape implements Colorable {

    private double size;

    public Square() {

    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+
                "size=" + size +
                '}';
    }
}
