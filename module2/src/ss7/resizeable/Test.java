package ss7.resizeable;

import ss7.resizeable.Circle;
import ss7.resizeable.Rectangle;
import ss7.resizeable.Square;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);
        circle.resize(20);
        Rectangle rectangle= new Rectangle(7,8);
        System.out.println(rectangle);
        rectangle.resize(20);
        Square square=new Square(4);
        square.resize(50);
        System.out.println(square.getArea());    }
}
