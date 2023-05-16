package ss7.colorable;

public class Test {
    public static void main(String[] args) {
        Shape[] shape=new Shape[5];
        shape[0]= new Circle(3,"blue",true);
        shape[1]= new Circle(4,"blue",true);
        shape[2]= new Square("a",true,10);
        shape[3]= new Circle(5,"blue",true);
        shape[4]= new Circle(6,"blue",true);
        for (Shape s: shape) {
            if(s instanceof Square){
                ((Square) s).howToColor();
            }else {
                System.out.println(s.toString());
            }
        }
    }
}
