package castudy.model.person;

public class Customer extends Person {
    private String address;
    private String customerLevel;

    public Customer() {
    }

    public Customer(String id, String name, String dateOfBirth, String gender, String idCode, String phoneNumber, String email, String address, String customerLevel) {
        super(id, name, dateOfBirth, gender, idCode, phoneNumber, email);
        this.address = address;
        this.customerLevel = customerLevel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
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
        return "Customer{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", idCode='" + getIdCode() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                "address='" + address + '\'' +
                ", customerLevel='" + customerLevel + '\'' +
                '}';
    }
}
