package castudy.model.facility;

public class VillaForRent extends Facility {
    private String roomStandard;
    private String swimmingPoolArea;
    private String numberOfFloors;

    public VillaForRent() {
    }

    public VillaForRent(String serviceCode, String serviceName, String usableArea, String rentalCosts, String maximumNumberOfPeople, String rentalType, String roomStandard, String swimmingPoolArea, String numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(String swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
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
        return "VillaForRent{" +
                "serviceCode='" + getServiceCode() + '\'' +
                ", serviceName='" + getServiceCode() + '\'' +
                ", usableArea='" + getUsableArea() + '\'' +
                ", rentalCosts='" + getRentalCosts() + '\'' +
                ", MaximumNumberOfPeople='" + getMaximumNumberOfPeople() + '\'' +
                ", rentalType='" + getRentalCosts() + '\'' +
                "roomStandard='" + roomStandard + '\'' +
                ", swimmingPoolArea='" + swimmingPoolArea + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }
}
