package bai_lam_them.service;

import bai_lam_them.model.Student;
import bai_lam_them.repository.StudentRepository;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private StudentRepository studentRepository = new StudentRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayStudent() {
        List<Student> studentList = studentRepository.getAll();
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    @Override
    public void addStudent() {
        //String id, String name, String dayofbirth, String gender, String classes, double point
        System.out.println("nhập id: ");
        String id = scanner.nextLine();
        System.out.println(" nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("nhập năm sinh");
        String dayOfBirth = scanner.nextLine();
        System.out.println("nhập giới tính");
        String genDer = scanner.nextLine();
        System.out.println("nhập lớp");
        String classes = scanner.nextLine();
        double point= 0;
        do {
            try {
                System.out.println("nhập điểm");
                point = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("nhập sai nhập lại");
            }
        }while (true);


        Student student = new Student(id, name, dayOfBirth, genDer, classes, point);
        studentRepository.addStudent(student);
        System.out.println("thêm thành công");
    }

    @Override
    public void removeStudent() {
        List<Student> studentList = studentRepository.getAll();
        System.out.println("nhập id cần xoá");
        String id = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (id.equals(studentList.get(i).getId())) {
                studentRepository.removeStudent(i);
                System.out.println("xoá oke");
            }

        }
    }

    @Override
    public void removeS() {
        List<Student> studentList = studentRepository.getAll();
        System.out.println("nhập id cần xoá");
        String id = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if(id.equals(studentList.get(i).getId())){
                studentRepository.removeS(studentList.get(i));
                System.out.println("oke");
            }
        }
    }
}
