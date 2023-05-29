package mvc_lam_them.rypository;

import mvc_lam_them.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> getAll();
}
