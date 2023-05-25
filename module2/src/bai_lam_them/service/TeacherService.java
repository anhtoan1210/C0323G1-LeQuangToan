package bai_lam_them.service;

import bai_lam_them.model.Teacher;
import bai_lam_them.repository.TeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements ITeacherService {
    private TeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public void displayTeacher() {
        List<Teacher> teacherList =teacherRepository.getAll();
        for (Teacher p : teacherList) {
            System.out.println(p);
        }

    }
}
