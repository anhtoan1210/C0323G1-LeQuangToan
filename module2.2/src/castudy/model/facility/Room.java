package castudy.model.facility;

public class Room extends Facility {
    private String FreeServiceIncluded;

    public Room() {
    }


    public Room(String serviceCode, String serviceName, float usableArea, long rentalCosts, int maximumNumberOfPeople, String rentalType, String freeServiceIncluded) {
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
        return "Room{" +
                "Mã dic vụ='" + getServiceCode() + '\'' +
                ", Tên dịch vụ='" + getServiceName() + '\'' +
                ", Diện tích sử dụng =" + getUsableArea() +
                ", Chi phí thuê=" + getRentalCosts() +
                ", Số người tối đa =" + getMaximumNumberOfPeople() +
                ", Loại cho thee='" + getRentalType() + '\'' +
                "Dịch vụ miễn phí đi kèm='" + FreeServiceIncluded + '\'' +
                '}';
    }
}
