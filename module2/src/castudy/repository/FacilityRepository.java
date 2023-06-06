package castudy.repository;

import castudy.common.ReadAndWrite;
import castudy.model.facility.Facility;
import castudy.model.facility.HouseForRent;
import castudy.model.facility.RoomForRent;
import castudy.model.facility.VillaForRent;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static final Map<Facility, Integer> data = new LinkedHashMap<>();

    static {
        //String serviceCode, String serviceName, String usableArea, String rentalCosts, String maximumNumberOfPeople,
        // String rentalType, String roomStandard, String numberOfFloors
        Facility house1 = new HouseForRent("01", "House1", 200, 100000,
                10, "vip", "vip", 30);
        //String serviceCode, String serviceName, String usableArea, String rentalCosts, String maximumNumberOfPeople,
        // String rentalType, String freeServiceIncluded
        Facility room1 = new RoomForRent("02", "Room1", 200, 1000000, 20, "vip", "Massages miễn phí");
        //String serviceCode, String serviceName, String usableArea, String rentalCosts, String maximumNumberOfPeople,
        // String rentalType, String roomStandard, String swimmingPoolArea, String numberOfFloors)
        Facility villa1 = new VillaForRent("03", "Facility", 300, 5000000, 20, "vip", "vipro", 200, 30);
        data.put(house1, 0);
        data.put(room1, 5);
        data.put(villa1, 6);
    }

    @Override
    public Map<Facility, Integer> getData() {
        return data;
    }

    @Override
    public void addFacility(Facility facility) {
        data.put(facility, 0);


    }

    @Override
    public void removeFacility(Facility facility) {
        data.remove(facility);
    }

    @Override
    public Facility getById(String id) {
        for (Facility f : data.keySet()) {
            if (f.getServiceCode().equals(id)) {
                return f;
            }
        }
        return null;
    }

    @Override
    public List<Facility> getFacilityMaintain() {
        List<Facility> facilities = new ArrayList<>();
        for (Facility f : data.keySet()) {
            Integer maintain = data.get(f);
            if (maintain >= 5) {
                facilities.add(f);
            }
        }
        return facilities;
    }
}
