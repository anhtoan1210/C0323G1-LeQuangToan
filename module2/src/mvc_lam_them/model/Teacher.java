package mvc_lam_them.model;

public class Teacher extends Person {
    private String lever;

    public Teacher() {

    }

    public Teacher(String id, String name, String dayOfbirth, String geder, String lever) {
        super(id, name, dayOfbirth, geder);
        this.lever = lever;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "lever='" + lever + '\'' +
                '}';
    }
}
