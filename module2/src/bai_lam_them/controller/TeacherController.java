package bai_lam_them.controller;

import bai_lam_them.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private  TeacherService teacherService = new TeacherService();
    private  Scanner scanner = new Scanner(System.in);

    public void menuTeacher() {
        System.out.print("1.Hiển Thị");
        System.out.print("Nhập chức năng:");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                teacherService.displayTeacher();
                break;
            case "2":
                break;
            default:
                break;
        }
    }
}
