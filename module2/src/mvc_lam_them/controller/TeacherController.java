package mvc_lam_them.controller;

import bai_lam_them.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    Scanner scanner = new Scanner(System.in);
    TeacherService teacherService = new TeacherService();

    public void menuTeacher() {
        boolean flag = true;
        do {
            System.out.println("1.hien thi\n" +
                    "2.them\n" +
                    "3.xoa\n" +
                    "4.thoat\n");
            System.out.println("moi lua chon chuc nang");
            String str = scanner.nextLine();
            switch (str) {
                case "1":
                    teacherService.displayTeacher();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("moi nhap lai");
            }
        } while (flag);
    }
}
