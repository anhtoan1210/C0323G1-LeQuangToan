package ss4_class_object.model;

public class Doctor {
    private String name;
    private int yearOld;
    private String address;
    private String email;
    private long numberPhone;
    private String workingPosition;

    public Doctor() {
    }

    public Doctor(String name, int yearOld, String address, String email, long numberPhone, String workingPosition) {
        this.name = name;
        this.yearOld = yearOld;
        this.address = address;
        this.email = email;
        this.numberPhone = numberPhone;
        this.workingPosition = workingPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(long numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getWorkingPosition() {
        return workingPosition;
    }

    public void setWorkingPosition(String workingPosition) {
        this.workingPosition = workingPosition;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", yearOld=" + yearOld +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", numberPhone=" + numberPhone +
                ", workingPosition='" + workingPosition + '\'' +
                '}';
    }
}
