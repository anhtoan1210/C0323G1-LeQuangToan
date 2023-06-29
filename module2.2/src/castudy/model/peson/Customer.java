package castudy.model.peson;

public class Customer extends Person {
    private String address;
    private String customerLevel;

    public Customer() {
    }

    public Customer(String id, String name, String dateOfBirth, String gender, String idCode, String numberPhone, String email, String address, String customerLevel) {
        super(id, name, dateOfBirth, gender, idCode, numberPhone, email);
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
        return "Customer{" +
                "Mã khách hàng='" + getId() + '\'' +
                ", Tên khách hàng='" + getName() + '\'' +
                ", Ngày tháng năm sinh='" + getDateOfBirth() + '\'' +
                ", Giới tính='" + getGender() + '\'' +
                ", Chứng minh nhân dân='" + getIdCode() + '\'' +
                ", Số điện thoại='" + getNumberPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", Địa chỉ='" + address + '\'' +
                ", Cấp độ khách hàng='" + customerLevel + '\'' +
                '}';
    }
}
