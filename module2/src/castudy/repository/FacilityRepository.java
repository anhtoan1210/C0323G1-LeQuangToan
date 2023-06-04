package castudy.repository;

import castudy.common.ReadAndWrite;
import castudy.model.facility.Facility;

import java.util.ArrayList;
import java.util.List;

public class FacilityRepository implements IFacilityRepository {
    List<Facility> facilities = new ArrayList<>();
    private static final String PATH_PRODUCT = "src/castudy/data/facility.csv";

    @Override
    public List<Facility> getAll() {
        List<String> strings = ReadAndWrite.readFile(PATH_PRODUCT);
        facilities.clear();
        String[] info;
        for (String str : strings) {
            info = str.split(",");

        }
        return null;
    }
}
