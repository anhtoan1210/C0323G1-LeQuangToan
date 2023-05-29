package mvc_lam_them.service;

import mvc_lam_them.model.Teacher;
import mvc_lam_them.rypository.TeacherRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    TeacherRepository teacherRepository = new TeacherRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayTeacher() {
        List<Teacher> teacherList = teacherRepository.getAll();
        for (Teacher t : teacherList) {
            System.out.println(t);
        }
    }
}
