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
        Facility house1 = new HouseForRent("01", "House1", "tất cả", "10000000",
                "1000", "vip", "vip", "50");
        //String serviceCode, String serviceName, String usableArea, String rentalCosts, String maximumNumberOfPeople,
        // String rentalType, String freeServiceIncluded
        Facility room1 = new RoomForRent("02", "Room1", "tất cả", "100000000", "1000", "vip", "Massages miễn phí");
        //String serviceCode, String serviceName, String usableArea, String rentalCosts, String maximumNumberOfPeople,
        // String rentalType, String roomStandard, String swimmingPoolArea, String numberOfFloors)
        Facility villa1 = new VillaForRent("03", "Facility", "tất cả", "100000000", "10000", "vip", "vipro", "2000", "100");
        data.put(house1, 0);
        data.put(room1, 5);
        data.put(villa1, 0);
    }

    @Override
    public Map<Facility, Integer> getData() {
        return null;
    }
}
