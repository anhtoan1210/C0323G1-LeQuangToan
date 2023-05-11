package ss4_lop_va_doi_tuong.bai_tap.quadratic;

public class Quadratic {

    double a;
    double b;
    double c;


    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getDiscriminant() {
        double delta = (b * b) - 4 * a * c;
        return delta;
    }

    public double getRoot1() {
        double n1 = (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        return n1;
    }

    public double getRoot2() {
        double n2 = (-b - Math.sqrt(getDiscriminant()))/ (2 * a);
        return n2;
    }
}
