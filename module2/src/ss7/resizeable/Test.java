package ss7.resizeable;

import ss7.resizeable.Circle;
import ss7.resizeable.Rectangle;
import ss7.resizeable.Square;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);
        circle.resize(100);
        System.out.println(circle);
        Rectangle rectangle= new Rectangle(7,8);
        System.out.println(rectangle);
        rectangle.resize(20);
        System.out.println(rectangle);
        Square square=new Square(4);
        System.out.println(square);
        square.resize(50);
        System.out.println(square);    }
}
