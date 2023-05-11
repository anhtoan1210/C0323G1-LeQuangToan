package ss4_lop_va_doi_tuong.bai_tap.fan;

public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    int speed;
    boolean on;
    double radius;
    String color;


    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
}
