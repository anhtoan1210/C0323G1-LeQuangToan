package castudy.model.facility;

public class RoomForRent extends Facility {
    private String FreeServiceIncluded;

    public RoomForRent() {
    }

    public RoomForRent(String serviceCode, String serviceName, String usableArea, String rentalCosts, String maximumNumberOfPeople, String rentalType, String freeServiceIncluded) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        FreeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return FreeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        FreeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String getServiceCode() {
        return super.getServiceCode();
    }

    @Override
    public void setServiceCode(String serviceCode) {
        super.setServiceCode(serviceCode);
    }

    @Override
    public String getServiceName() {
        return super.getServiceName();
    }

    @Override
    public void setServiceName(String serviceName) {
        super.setServiceName(serviceName);
    }

    @Override
    public String getUsableArea() {
        return super.getUsableArea();
    }

    @Override
    public void setUsableArea(String usableArea) {
        super.setUsableArea(usableArea);
    }

    @Override
    public String getRentalCosts() {
        return super.getRentalCosts();
    }

    @Override
    public void setRentalCosts(String rentalCosts) {
        super.setRentalCosts(rentalCosts);
    }

    @Override
    public String getMaximumNumberOfPeople() {
        return super.getMaximumNumberOfPeople();
    }

    @Override
    public void setMaximumNumberOfPeople(String maximumNumberOfPeople) {
        super.setMaximumNumberOfPeople(maximumNumberOfPeople);
    }

    @Override
    public String getRentalType() {
        return super.getRentalType();
    }

    @Override
    public void setRentalType(String rentalType) {
        super.setRentalType(rentalType);
    }

    @Override
    public String toString() {
        return "RoomForRent{" +
                "serviceCode='" + getServiceCode() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea='" + getUsableArea() + '\'' +
                ", rentalCosts='" + getRentalCosts() + '\'' +
                ", MaximumNumberOfPeople='" + getMaximumNumberOfPeople() + '\'' +
                ", rentalType='" + getRentalType() + '\'' +
                "FreeServiceIncluded='" + FreeServiceIncluded + '\'' +
                '}';
    }
}
