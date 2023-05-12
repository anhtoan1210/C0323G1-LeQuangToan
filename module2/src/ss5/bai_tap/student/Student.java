package ss5.bai_tap.student;

public class Student {
    private String name;
    private String classes;

    public Student() {
        this.name = "Toản";
        this.classes = "c03";
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
