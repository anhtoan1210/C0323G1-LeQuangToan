package ss6.point;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 7);
        point2D.setXY(6, 7);
        System.out.println(point2D.toString());
        point2D.setX(9);
        System.out.println(point2D.getX());
        Point3D point3D = new Point3D(4, 5, 6);
        System.out.println(point3D.toString());


    }
}
