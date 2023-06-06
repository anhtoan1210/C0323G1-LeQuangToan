package castudy.model.facility;

public class VillaForRent extends Facility {
    private String roomStandard;
    private float swimmingPoolArea;
    private int numberOfFloors;

    public VillaForRent() {
    }

    public VillaForRent(String serviceCode, String serviceName, float usableArea, long rentalCosts, int maximumNumberOfPeople, String rentalType, String roomStandard, float swimmingPoolArea, int numberOfFloors) {
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

    public float getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(float swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
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
    public float getUsableArea() {
        return super.getUsableArea();
    }

    @Override
    public void setUsableArea(float usableArea) {
        super.setUsableArea(usableArea);
    }

    @Override
    public long getRentalCosts() {
        return super.getRentalCosts();
    }

    @Override
    public void setRentalCosts(long rentalCosts) {
        super.setRentalCosts(rentalCosts);
    }

    @Override
    public int getMaximumNumberOfPeople() {
        return super.getMaximumNumberOfPeople();
    }

    @Override
    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
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
