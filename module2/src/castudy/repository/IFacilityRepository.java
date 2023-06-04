package castudy.repository;

import castudy.model.facility.Facility;

import java.util.List;

public interface IFacilityRepository extends IRepository {
    List<Facility> getAll();
}
