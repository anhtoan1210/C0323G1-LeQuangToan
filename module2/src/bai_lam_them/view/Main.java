package bai_lam_them.view;

import bai_lam_them.controller.MenuController;
import bai_lam_them.controller.TeacherController;
import bai_lam_them.service.TeacherService;

public class Main {
    public static void main(String[] args) {
//        MenuController menuController = new MenuController();
//        menuController.showMenu();
        TeacherController teacherController = new TeacherController();
        teacherController.menuTeacher();
    }
}
