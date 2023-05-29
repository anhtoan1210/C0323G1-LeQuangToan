package mvc_lam_them.model;

import mvc_lam_them.model.Person;

public class Student extends Person {
    private String classes;
    private double point;

    public Student() {

    }

    public Student(String id, String name, String dayOfbirth, String geder, String classes, double point) {
        super(id, name, dayOfbirth, geder);
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
                "classes='" + classes + '\'' +
                ", point=" + point +
                '}';
    }
}
