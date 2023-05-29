package mvc_lam_them.model;

public class Person {
    private String id;
    private String name;
    private String dayOfbirth;
    private String geder;

    public  Person() {

    }

    public Person(String id, String name, String dayOfbirth, String geder) {
        this.id = id;
        this.name = name;
        this.dayOfbirth = dayOfbirth;
        this.geder = geder;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfbirth() {
        return dayOfbirth;
    }

    public void setDayOfbirth(String dayOfbirth) {
        this.dayOfbirth = dayOfbirth;
    }

    public String getGeder() {
        return geder;
    }

    public void setGeder(String geder) {
        this.geder = geder;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dayOfbirth='" + dayOfbirth + '\'' +
                ", geder='" + geder + '\'' +
                '}';
    }
}
