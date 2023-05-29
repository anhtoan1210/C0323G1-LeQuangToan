package mvc_lam_them.controller;

import bai_lam_them.service.StudentService;

import java.util.Scanner;

public class StudentController {
    Scanner scanner = new Scanner(System.in);
    private StudentService studentService = new StudentService();

    public void menuStudent() {
        boolean flag = true;
        do {
            System.out.println("1.hien thi\n" +
                    "2.them\n" +
                    "3.xoa\n" +
                    "4.thoat\n");
            System.out.println("nhap chuc nawng");
            String str = scanner.nextLine();
            switch (str) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("moiw ban nhap lai");
            }
        } while (flag);
    }
}
