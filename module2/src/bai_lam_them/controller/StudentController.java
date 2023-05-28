package bai_lam_them.controller;

import bai_lam_them.service.StudentService;

import java.util.Scanner;

public class StudentController {
    Scanner scanner = new Scanner(System.in);
    private StudentService studentService = new StudentService();

    public void menuStudent() {
        boolean flag = true;
        do {
            System.out.println("1.hiển thi\n" +
                    "2.thêm\n" +
                    "3.xoá\n" +
                    "4. xoá đt\n" +
                    "5.thoát");
            System.out.println("nhập chức năng");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    studentService.displayStudent();
                    break;
                case "2":
                    studentService.addStudent();
                    break;
                case "3":
                    studentService.removeStudent();
                    break;
                case "4":
                    studentService.removeS();
                    break;
                case "5":
                    flag = false;
                    break;
                default:
                    System.out.println("bạn nhập sai mời bạn nhập lại");
                    break;
            }
        } while (flag);
    }
}
