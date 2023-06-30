package castudy.service;

import castudy.model.peson.Employee;
import castudy.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void displayEmployee() {
        List<Employee> employees = employeeRepository.getAll();
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    @Override
    public void addEmployee() {
        //String id, String name, String dateOfBirth, String gender, String idCode,
        // String numberPhone, String email, String lerVer, String location, long wage) {
        System.out.println("Nhập mã nhân viên");
        String id = scanner.nextLine();
        System.out.println("Nhập tên nhân viên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập chứng minh nhân dân");
        String idCode = scanner.nextLine();
        System.out.println("Nhập số điện thoại");
        String numberPhone = scanner.nextLine();
        System.out.println("Nhập email");
        String email = scanner.nextLine();

        String lerVer;
        AL:
        do {
            System.out.println("Nhập trình độ");
            System.out.println("1.Trung cấp");
            System.out.println("2.Cao đẳng");
            System.out.println("3.Đại học");
            System.out.println("4.Sau đại học");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice > 0 && choice <= 4) {
                        break;
                    }
                    System.out.println("Vui lòng nhập trong khoảng 1-4");
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                } catch (Exception e) {

                }
            }
            switch (choice) {
                case 1:
                    lerVer = "Trung cấp";
                    break AL;
                case 2:
                    lerVer = "Cao đẳng";
                    break AL;
                case 3:
                    lerVer = "Đại học";
                    break AL;
                case 4:
                    lerVer = "Sau đại học";
                    break AL;
                default:
                    System.out.println("Nhập sai nhập lại");
                    break;
            }
        } while (true);

        System.out.println("Vị trí ");
        String location = scanner.nextLine();
        System.out.println("Nhập lương");
        long wage = Long.parseLong(scanner.nextLine());
        Employee employee = new Employee(id, name, dateOfBirth, gender, idCode, numberPhone, email, lerVer, location, wage);
        employeeRepository.add(employee);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void deleteEmployee() {
        System.out.println("Nhập id mà bạn muốn xoá");
        String id = scanner.nextLine();
        Employee employee = employeeRepository.getById(id);
        if (employee == null) {
            System.out.println("Không tìm thấy mã sản phẩm cần xoá");
        } else {
            System.out.println("Bạn có chắc chắn muốn xoá");
            System.out.println("1.Có");
            System.out.println("2.Không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                employeeRepository.delete(employee);
                System.out.println("Xoá thành công");
            }
        }
    }

    @Override
    public void searchEmployee() {
        System.out.println("Nhập tên nhân viên cần tìm kiếm");
        String name = scanner.nextLine();
        List<Employee> employees = employeeRepository.search(name);
        for (Employee e : employees) {
            System.out.println(e);
        }
        if (employees.isEmpty()) {
            System.out.println("không tìm thấy");
        }

    }

    @Override
    public void editEmployee() {
        System.out.println("nhập id mà bạn muốn sửa");
        String id = scanner.nextLine();
        List<Employee> employees = employeeRepository.getAll();
        for (int i = 0; i < employees.size(); i++) {
            if (id.equals(employees.get(i).getId())) {
                //String id, String name, String dateOfBirth, String gender, String idCode,
                // String numberPhone, String email, String lerVer, String location, long wage)
                System.out.println("Nhập tên");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sinh");
                String dateOfBirth = scanner.nextLine();
                System.out.println("Nhập giới tính");
                String gender = scanner.nextLine();
                System.out.println("Nhập chứng minh nhân dân");
                String idCode = scanner.nextLine();
                System.out.println("Nhập sô diện thoại");
                String numberPhone = scanner.nextLine();
                System.out.println("Nhập email");
                String email = scanner.nextLine();
                System.out.println("Nhập cấp dộ");
                String lerVer = scanner.nextLine();
                System.out.println("Nhập địa chỉ");
                String location = scanner.nextLine();
                System.out.println("Nhập lương");
                long wage = Long.parseLong(scanner.nextLine());
                Employee employee = new Employee(id, name, dateOfBirth, gender, idCode, numberPhone, email, lerVer, location, wage);
                employeeRepository.edit(i, employee);
                System.out.println("Sửa thành công");
            }
        }
    }
}
