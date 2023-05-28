package bai_lam_them.repository;

import bai_lam_them.common.ReadAndWriteStudent;
import bai_lam_them.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {

    @Override
    public List<Student> getAll() {
        List<Student>studentList = ReadAndWriteStudent.readTFileStudent("src/bai_lam_them/data/student.csv");
        return studentList;
    }

    @Override
    public void addStudent(Student student) {
        List<Student>studentList = ReadAndWriteStudent.readTFileStudent("src/bai_lam_them/data/student.csv");
        studentList.add(student);
        ReadAndWriteStudent.writeToFile("src/bai_lam_them/data/student.csv",studentList);
    }

    @Override
    public void removeStudent(int index) {
        List<Student>studentList = ReadAndWriteStudent.readTFileStudent("src/bai_lam_them/data/student.csv");
        studentList.remove(index);
        ReadAndWriteStudent.writeToFile("src/bai_lam_them/data/student.csv",studentList);
    }


    @Override
    public void removeS(Student student) {
        List<Student>studentList = ReadAndWriteStudent.readTFileStudent("src/bai_lam_them/data/student.csv");
        studentList.remove(student);
        ReadAndWriteStudent.writeToFile("src/bai_lam_them/data/student.csv",studentList);
    }
}
