package castudy.model.facility;

public abstract class Facility {
    private String serviceCode;
    private String serviceName;
    private String usableArea;
    private String rentalCosts;
    private String MaximumNumberOfPeople;
    private String rentalType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, String usableArea, String rentalCosts, String maximumNumberOfPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        MaximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaximumNumberOfPeople() {
        return MaximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(String maximumNumberOfPeople) {
        MaximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", MaximumNumberOfPeople='" + MaximumNumberOfPeople + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
