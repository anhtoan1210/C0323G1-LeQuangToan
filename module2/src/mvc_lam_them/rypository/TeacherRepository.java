package mvc_lam_them.rypository;

import mvc_lam_them.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private static List<Teacher> teacherList = new ArrayList<>();

    static {
        Teacher teacher = new Teacher("01", "tony", "2000", "nam", "trung cap");
        Teacher teacher1 = new Teacher("02", "tony", "2000", "nam", "trung cap");
        Teacher teacher2 = new Teacher("03", "tony", "2000", "nam", "trung cap");
        teacherList.add(teacher);
        teacherList.add(teacher1);
        teacherList.add(teacher2);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }
}
