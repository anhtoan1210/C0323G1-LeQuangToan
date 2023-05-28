package bai_lam_them.service;

import bai_lam_them.model.Teacher;
import bai_lam_them.repository.TeacherRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private TeacherRepository teacherRepository = new TeacherRepository();

    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayTeacher() {
        List<Teacher> teacherList = teacherRepository.getAll();
        for (Teacher p : teacherList) {
            System.out.println(p);
        }
    }

    @Override
    public void addTeacher() {
        //String id, String name, String dayofbirth, String gender, String lever) {
        System.out.print("nhập id: ");
        String id = scanner.nextLine();
        System.out.println("nhaapj name");
        String name = scanner.nextLine();
        System.out.println("nhập ngày sinh");
        String dayOfBirth = scanner.nextLine();
        System.out.println("nhập giới tính");
        String genDer = scanner.nextLine();
        System.out.println("nhập lever");
        String lever = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, dayOfBirth, genDer, lever);
        teacherRepository.addTeacher(teacher);
        System.out.println("thêm thành công");
    }

    @Override
    public void removeTeacher() {
        List<Teacher> teacherList = teacherRepository.getAll();
        System.out.println("nhap id xoa");
        String id = scanner.nextLine();
        for (int i = 0; i < teacherList.size(); i++) {
            if (id.equals(teacherList.get(i).getId())) {
                teacherRepository.removeTeacher(i);
                System.out.println("xoá oke");
            }
        }
    }

    @Override
    public void removeS() {
        List<Teacher> teacherList = teacherRepository.getAll();
        System.out.println("nhập ids cần xoá");
        String ids = scanner.nextLine();
        for (int i = 0; i < teacherList.size(); i++) {
            if (ids.equals(teacherList.get(i).getId())) {
                teacherRepository.removeS(teacherList.get(i));
                System.out.println("oke");
            }
        }
    }
}
