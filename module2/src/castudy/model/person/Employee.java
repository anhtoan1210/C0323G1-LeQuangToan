package castudy.model.person;

public class Employee extends Person{
    private String level;
    private String location;
    private long luong;

    public Employee() {
    }


    public Employee(String id, String name, String dateOfBirth, String gender, String idCode, String phoneNumber, String email, String trinhDo, String vitri, long luong) {
        super(id, name, dateOfBirth, gender, idCode, phoneNumber, email);
        this.level = trinhDo;
        this.location = vitri;
        this.luong = luong;
    }

    public String getTrinhDo() {
        return level;
    }

    public void setTrinhDo(String trinhDo) {
        this.level = trinhDo;
    }

    public String getVitri() {
        return location;
    }

    public void setVitri(String vitri) {
        this.location = vitri;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
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
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
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
                ", id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", idCode='" + getIdCode() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", trinhDo='" + level + '\'' +
                ", vitri='" + location + '\'' +
                ", luong=" + luong +
                '}';
    }
}
