package bai_lam_them.repository;

import bai_lam_them.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();

    void addStudent(Student student);

    void removeStudent(int index);

    void removeS(Student student);
}
