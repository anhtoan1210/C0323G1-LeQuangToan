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
                    "4.Return main menu\n");
            String str = scanner.nextLine();
            switch (str) {
                case "1":
                    employeeService.displayEmployeeService();
                    break;
                case "2":
                    employeeService.addEmployeeService();
                    break;
                case "3":
                    break;
                case "4":
                    break;
            }
        } while (flag);
    }
}
