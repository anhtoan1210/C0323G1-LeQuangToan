package castudy.repository;

import castudy.model.facility.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository extends IRepository {
    Map<Facility, Integer> getData();

    void addFacility(Facility facility);

    void removeFacility(Facility facility);

    Facility getById(String id);

    List<Facility> getFacilityMaintain();

}
