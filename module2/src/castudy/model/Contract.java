package castudy.model;

public class Contract {
    private String idContact;
    private String idBooking;
    private String deposit;
    private String totalPay;

    public Contract() {
    }

    public Contract(String idContact, String idBooking, String deposit, String totalPay) {
        this.idContact = idContact;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.totalPay = totalPay;
    }

    public String getIdContact() {
        return idContact;
    }

    public void setIdContact(String idContact) {
        this.idContact = idContact;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(String totalPay) {
        this.totalPay = totalPay;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContact='" + idContact + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", deposit='" + deposit + '\'' +
                ", totalPay='" + totalPay + '\'' +
                '}';
    }
}
