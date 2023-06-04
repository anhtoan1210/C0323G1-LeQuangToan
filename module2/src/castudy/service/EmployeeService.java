package castudy.service;

import castudy.model.person.Employee;
import castudy.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayEmployeeService() {
        List<Employee> employeeList = employeeRepository.getAll();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmployeeService() {
        //String id, String name, String dateOfBirth, String gender, String idCode, String phoneNumber, String email, String trinhDo, String vitri, long luong
        System.out.println("nhập id");
        String id = scanner.nextLine();
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập năm sinh");
        String dateOfBirth = scanner.nextLine();
        System.out.println("nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("nhập CMND");
        String idCode = scanner.nextLine();
        System.out.println("nhập vào số điện thoại");
        String phoneNumber = scanner.nextLine();
        System.out.println("nhập vào email");
        String email = scanner.nextLine();
        System.out.println("nhập trình độ");
        String level = scanner.nextLine();
        System.out.println("nhập vị trí");
        String location = scanner.nextLine();
        System.out.println("nhập lương");
        Long wage = Long.parseLong(scanner.nextLine());
        Employee employee = new Employee(id, name, dateOfBirth, gender, idCode, phoneNumber, email, level, location, wage);
        employeeRepository.addEmployee(employee);
        System.out.println("thêm thành công");
    }


    @Override
    public void editEmployeeService() {
        System.out.println("nhập id nhân viên bạn muốc sửa");
        String id = scanner.nextLine();
        List<Employee> employeeList = employeeRepository.getAll();
        for (int i = 0; i < employeeList.size(); i++) {
            if (id.equals(employeeList.get(i).getId())) {
                System.out.println("nhập tên");
                String name = scanner.nextLine();
                System.out.println("nhập năm sinh");
                String dateOfBirth = scanner.nextLine();
                System.out.println("nhập giới tính");
                String gender = scanner.nextLine();
                System.out.println("nhập CMND");
                String idCode = scanner.nextLine();
                System.out.println("nhập vào số điện thoại");
                String phoneNumber = scanner.nextLine();
                System.out.println("nhập vào email");
                String email = scanner.nextLine();
                System.out.println("nhập trình độ");
                String level = scanner.nextLine();
                System.out.println("nhập vị trí");
                String location = scanner.nextLine();
                System.out.println("nhập lương");
                Long wage = Long.parseLong(scanner.nextLine());
                Employee employee1 = new Employee(id, name, dateOfBirth, gender, idCode, phoneNumber, email, level, location, wage);
                employeeRepository.editEmployee(i, employee1);
            }
        }
    }

    @Override
    public void deleteEmployee() {
        List<Employee> employeeList = employeeRepository.getAll();
        System.out.println("nhập id mà bạn muốn xoá");
        String id = scanner.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (id.equals(employeeList.get(i).getId())) {
                employeeRepository.removeEmployee(i);
                System.out.println("xoá xong");
            }
        }
    }

    @Override
    public void searchEmployee() {
        System.out.println("nhập tên nhân viên mà bạn muốn tìm kiếm");
        String name = scanner.nextLine();
        List<Employee> employees = employeeRepository.employeeList(name);
        for (Employee e: employees) {
            System.out.println(e);
        }
    }
}
