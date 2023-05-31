package castudy.model.facility;

public class HouseForRent extends Facility {
    private String roomStandard;
    private String numberOfFloors;

    public HouseForRent() {
    }

    public HouseForRent(String serviceCode, String serviceName, String usableArea, String rentalCosts, String maximumNumberOfPeople, String rentalType, String roomStandard, String numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
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
        return "HouseForRent{" +
                "serviceCode='" + getServiceCode() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", usableArea='" + getUsableArea() + '\'' +
                ", rentalCosts='" + getRentalCosts() + '\'' +
                ", MaximumNumberOfPeople='" + getMaximumNumberOfPeople() + '\'' +
                ", rentalType='" + getRentalType() + '\'' +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }
}
