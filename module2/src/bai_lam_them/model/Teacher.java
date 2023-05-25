package bai_lam_them.model;

public class Teacher extends Person {
    private String lever;

    public Teacher() {

    }

    public Teacher(String id, String name, String dayofbirth, String gender, String lever) {
        super(id, name, dayofbirth, gender);
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
        return "Teacher{"+
                super.toString()+
                ", lever='" + lever + '\'' +
                '}';
    }
}
