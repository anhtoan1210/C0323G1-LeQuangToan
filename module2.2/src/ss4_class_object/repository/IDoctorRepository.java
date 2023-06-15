package ss4_class_object.repository;

import ss4_class_object.model.Doctor;

import java.util.List;

public interface IDoctorRepository {
    List<Doctor> getAll();

    void add(Doctor doctor);
}
