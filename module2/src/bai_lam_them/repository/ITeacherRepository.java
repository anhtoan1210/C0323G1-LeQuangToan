package bai_lam_them.repository;

import bai_lam_them.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> getAll();

    void addTeacher(Teacher teacher);

    void removeTeacher(int index);
    void removeS(Teacher teacher);
}
