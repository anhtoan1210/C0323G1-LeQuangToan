package castudy.model;

public class Booking {
    private String idBooKing;
    private String dateBooking;
    private String dateStart;
    private String dateEnd;
    private String idCustomer;
    private String idService;

    public Booking() {
    }

    public Booking(String idBooKing, String dateBooking, String dateStart, String dateEnd, String idCustomer, String idService) {
        this.idBooKing = idBooKing;
        this.dateBooking = dateBooking;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public String getIdBooKing() {
        return idBooKing;
    }

    public void setIdBooKing(String idBooKing) {
        this.idBooKing = idBooKing;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooKing='" + idBooKing + '\'' +
                ", dateBooking='" + dateBooking + '\'' +
                ", dateStart='" + dateStart + '\'' +
                ", dateEnd='" + dateEnd + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", idService='" + idService + '\'' +
                '}';
    }
}
