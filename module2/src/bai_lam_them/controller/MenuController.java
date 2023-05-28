package bai_lam_them.controller;

import bai_lam_them.service.TeacherService;

import java.util.Scanner;

public class MenuController {
    private TeacherController teacherController = new TeacherController();
    private StudentController studentController = new StudentController();

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1.Teacher\n" +
                    "2.Student\n" +
                    "3.thoát\n" +
                    "Mời bạn chọn chức năng");
            String str = scanner.nextLine();
            switch (str) {
                case "1":
                    teacherController.menuTeacher();
                    break;
                case "2":
                    studentController.menuStudent();
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
                    break;
            }

        } while (flag);
    }
}
