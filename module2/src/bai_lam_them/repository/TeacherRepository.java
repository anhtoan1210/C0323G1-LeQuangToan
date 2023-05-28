package bai_lam_them.repository;

import bai_lam_them.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private static List<Teacher> teachersList = new ArrayList<>();

    static {
        Teacher teacher = new Teacher("01", "Toản", "2000", "Nam", "Thạc sĩ");
        Teacher teacher1 = new Teacher("02", "Lâm", "2002", "Nữ", "Trung cấp");
        Teacher teacher2 = new Teacher("03", "hùng", "2000", "Nam", "Thạc sĩ");
        teachersList.add(teacher);
        teachersList.add(teacher1);
        teachersList.add(teacher2);
    }

    @Override
    public List<Teacher> getAll() {
        return teachersList;
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teachersList.add(teacher);
    }

    @Override
    public void removeTeacher(int index) {
        teachersList.remove(index);
    }

    @Override
    public void removeS(Teacher teacher) {
        teachersList.remove(teacher);
    }
}
