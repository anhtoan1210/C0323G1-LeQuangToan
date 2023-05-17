package ss7.resizeable;

import ss7.resizeable.Resizeable;
import ss7.resizeable.Shape;

public class Square extends Shape implements Resizeable {
   private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public Square() {

    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double getArea() {
        return getEdge() * getEdge();
    }

    @Override
    public void resize(double percent) {
        double edge = getEdge()+(getEdge()*percent/100);
        System.out.println("trước: "+getArea()+"sau: "+edge);
    }
}
