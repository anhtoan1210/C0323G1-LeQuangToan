package castudy.controller;

import castudy.service.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeService employeeService = new EmployeeService();

    public void menuEmployee() {
        do {


            System.out.println("--------------");
            System.out.println("------Mời bạn lựa chọn chức năng------");
            System.out.println("1. Hiển thị dánh sách nhân viên");
            System.out.println("2.Thêm mới nhân viên");
            System.out.println("3.Chỉnh sửa nhân viên");
            System.out.println("4. Xoá nhân viên");
            System.out.println("5. Tìm kiếm nhân viên");
            System.out.println("6. Thoát khỏi Menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeService.displayEmployee();
                    break;
                case 2:
                    employeeService.addEmployee();
                    break;
                case 3:
                    break;
                case 4:
                    employeeService.deleteEmployee();

                    break;
                case 5:
                    employeeService.searchEmployee();
                    break;
                case 6:
                    System.exit(1);
            }
        } while (true);
    }
}