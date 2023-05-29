package mvc_lam_them.rypository;

import mvc_lam_them.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudenRepository implements IStudentRepository {
    private static List<Student> studentList = new ArrayList<>();

    static {
        Student student = new Student("01", "Hua Van Cuong", "1975", "nam", "c00", 10);
        Student student1 = new Student("02", "Hua Van Cuong", "1975", "nam", "c00", 10);
        Student student2 = new Student("03", "Hua Van Cuong", "1975", "nam", "c00", 10);
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
    }


    @Override
    public List<Student> getAll() {
        return studentList;
    }
}
