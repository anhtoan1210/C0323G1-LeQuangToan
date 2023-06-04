package castudy.controller;

import castudy.service.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    Scanner scanner = new Scanner(System.in);
    private EmployeeService employeeService = new EmployeeService();

    public void showMenuEmployeeM() {
        boolean flag = true;
        do {
            System.out.println("1.Display list employees\n" +
                    "2.Add new employee\n" +
                    "3.Edit employee\n" +
                    "4. delete employee\n" +
                    "5.Search\n" +
                    "6.Return main menu\n");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("vui lòng nhập số");
                }
            }
            switch (choice) {
                case 1:
                    employeeService.displayEmployeeService();
                    break;
                case 2:
                    employeeService.addEmployeeService();
                    break;
                case 3:
                    employeeService.editEmployeeService();
                    break;
                case 4:
                    employeeService.deleteEmployee();
                    break;
                case 5:
                    employeeService.searchEmployee();
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("yêu cầu đồng chí nhập 1-6 thôi.Ham hố nhập cho nhiều");
            }
        } while (flag);
    }
}
