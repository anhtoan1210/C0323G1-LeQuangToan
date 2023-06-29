package castudy.model.peson;

public class Employee extends Person {
    private String lerVer;
    private String location;
    private long wage;

    public Employee() {
    }

    public Employee(String id, String name, String dateOfBirth, String gender, String idCode, String numberPhone, String email, String lerVer, String location, long wage) {
        super(id, name, dateOfBirth, gender, idCode, numberPhone, email);
        this.lerVer = lerVer;
        this.location = location;
        this.wage = wage;
    }

    public String getLerVer() {
        return lerVer;
    }

    public void setLerVer(String lerVer) {
        this.lerVer = lerVer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getWage() {
        return wage;
    }

    public void setWage(long wage) {
        this.wage = wage;
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getDateOfBirth() {
        return super.getDateOfBirth();
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        super.setDateOfBirth(dateOfBirth);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public String getIdCode() {
        return super.getIdCode();
    }

    @Override
    public void setIdCode(String idCode) {
        super.setIdCode(idCode);
    }

    @Override
    public String getNumberPhone() {
        return super.getNumberPhone();
    }

    @Override
    public void setNumberPhone(String numberPhone) {
        super.setNumberPhone(numberPhone);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Mã nhân viên='" + getId() + '\'' +
                ", Tên='" + getName() + '\'' +
                ", Ngày sinh='" + getDateOfBirth() + '\'' +
                ", Giới tính='" + getGender() + '\'' +
                ", Chứng minh nhân dân='" + getIdCode() + '\'' +
                ", Số điện thoại='" + getNumberPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                "Cấp độ='" + lerVer + '\'' +
                ", Vị trí='" + location + '\'' +
                ", Lương=" + wage +
                '}';
    }
}
