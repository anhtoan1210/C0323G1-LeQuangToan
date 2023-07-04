package castudy.repository;

import castudy.model.facility.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository {
    Map<Facility, Integer> getData();

    void add(Facility facility);

    void delete(Facility facility);

    Facility getById(String id);

    List<Facility> getFacilityMaintain();
}
