package bai_lam_them.controller;

import bai_lam_them.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private TeacherService teacherService = new TeacherService();
    private Scanner scanner = new Scanner(System.in);

    public void menuTeacher() {
        boolean flag = true;
        do {
            System.out.print("1.Hiển Thị\n" +
                    "2. Thêm\n" +
                    "3.xoá\n" +
                    "4. xoá đt\n" +
                    "5.thoát");
            System.out.print("Nhập chức năng: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    teacherService.displayTeacher();
                    break;
                case "2":
                    teacherService.addTeacher();
                    break;
                case "3":
                    teacherService.removeTeacher();
                    break;
                case "4":
                    teacherService.removeS();
                    break;
                case "5":
                    flag = false;
                    break;
                default:
                    System.out.println("Nhập sai nhập lại");
                    break;
            }
        } while (flag);

    }
}
