package castudy.model.peson;

import java.util.Objects;

public abstract class Person {
    private String id;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String idCode;
    private String numberPhone;
    private String email;

    public Person() {
    }

    public Person(String id, String name, String dateOfBirth, String gender, String idCode, String numberPhone, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCode = idCode;
        this.numberPhone = numberPhone;
        this.email = email;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idCode='" + idCode + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
