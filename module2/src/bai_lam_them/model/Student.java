package bai_lam_them.model;

public class Student extends Person {
    private String classes;
    private double point;

    public Student() {

    }

    public Student(String id, String name, String dayofbirth, String gender, String classes, double point) {
        super(id, name, dayofbirth, gender);
        this.classes = classes;
        this.point = point;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                ", classes='" + classes + '\'' +
                ", point=" + point +
                '}';
    }
}
