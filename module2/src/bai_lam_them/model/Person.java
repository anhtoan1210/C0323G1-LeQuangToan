package bai_lam_them.model;

public abstract class Person {
    private String id;
    private String name;
    private String dayofbirth;
    private String gender;

    public Person() {

    }

    public Person(String id, String name, String dayofbirth, String gender) {
        this.id = id;
        this.name = name;
        this.dayofbirth = dayofbirth;
        this.gender = gender;
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

    public String getDayofbirth() {
        return dayofbirth;
    }

    public void setDayofbirth(String dayofbirth) {
        this.dayofbirth = dayofbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dayofbirth='" + dayofbirth + '\'' +
                ", gender='" + gender + '\''
               ;
    }
}

