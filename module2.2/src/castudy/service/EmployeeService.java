package castudy.service;

import castudy.model.peson.Employee;
import castudy.regex.Regex;
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
        String id;
        do {
            System.out.println("Nhập mã nhân viên theo định dạng NV-YYYY");
            id = scanner.nextLine();
        } while (!Regex.checkId(id));
        String name;
        do {
            System.out.println("Nhập tên nhân viên(Viết hoa chữa đầu cua mỗi chữ)");
            name = scanner.nextLine();
        } while (!Regex.checkName(name));
        System.out.println("Nhập ngày sinh");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        String idCode;
        do {
            System.out.println("Nhập chứng minh nhân dân(phải đủ 9 hoặc 12 số)");
            idCode = scanner.nextLine();
        } while (!Regex.checkIdCode(idCode));

        String numberPhone;
        do {
            System.out.println("Nhập số điện thoại(-Số điện thoại phải bắt đầu từ 0 và đủ 10 số.)");
            numberPhone = scanner.nextLine();
        } while (!Regex.checkNumberPhone(numberPhone));
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
        String location;
        BL:
        do {
            System.out.println("nhập ví trí");
            System.out.println("1.Lễ tân");
            System.out.println("2.Phục vụ");
            System.out.println("3.Chuyên viên");
            System.out.println("4. Giám sát");
            System.out.println("5. Quản lí");
            System.out.println("6.Giám đốc");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice > 0 && choice <= 6) {
                        break;
                    }
                    System.out.println("Vui lòng nhập đúng trong khoảng 1-6");
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                } catch (Exception e) {

                }
            }
            switch (choice) {
                case 1:
                    location = "Lễ tân";
                    break BL;
                case 2:
                    location = "Phục vụ";
                    break BL;
                case 3:
                    location = "Chuyên vien";
                    break BL;
                case 4:
                    location = "Giám sát";
                    break BL;
                case 5:
                    location = "Quản lí";
                    break BL;
                case 6:
                    location = "Giám đốc";
                    break BL;
                default:
                    System.out.println("Nhập sai nhập lại");
            }
        } while (true);
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
        Employee employee = employeeRepository.getById(id);
        for (int i = 0; i < employees.size(); i++) {
            if (id.equals(employees.get(i).getId())) {
                System.out.println("----------Chọn thông tin bạn muốn sửa------------");
                //String id, String name, String dateOfBirth, String gender, String idCode
                // , String numberPhone, String email, String lerVer, String location, long wage
                System.out.println("1.Sua ten");
                System.out.println("2.Sửa ngày sinh");
                System.out.println("3.Sửa giới tính");
                System.out.println("4.Sửa chứng minh nhân dân");
                System.out.println("5.sửa số điện thoại");
                System.out.println("6.Sửa email");
                System.out.println("7.Sửa trình độ");
                System.out.println("8.Sửa vị trí");
                System.out.println("9.Sửa lương");
                System.out.println("0.Quay lại");
                int choice = Integer.parseInt(scanner.nextLine());
                String name;
                String dateOfBirth;
                String gender;
                String idCode;
                String numberPhone;
                String email;
                String lerVer;
                String location;
                long wage;

                switch (choice) {
                    case 1:
                        System.out.println("Nhập tên");
                        name = scanner.nextLine();
                        employee.setName(name);
                        employeeRepository.edit(i, employee);
                        System.out.println("Sua Thành công");
                        break;
                    case 2:
                        System.out.println("Nhập ngày sinh");
                        dateOfBirth = scanner.nextLine();
                        employee.setDateOfBirth(dateOfBirth);
                        employeeRepository.edit(i, employee);
                        System.out.println("Sua Thành công");
                        break;
                    case 3:
                        System.out.println("Nhập giới tính");
                        gender = scanner.nextLine();
                        employee.setGender(gender);
                        employeeRepository.edit(i,employee);
                        System.out.println("Sua Thành công");
                        break;
                    case 4:
                        System.out.println("Nhập chứng minh nhân dân");
                        idCode = scanner.nextLine();
                        employee.setIdCode(idCode);
                        employeeRepository.edit(i,employee);
                        System.out.println("Sua Thành công");
                        break;
                    case 5:
                        System.out.println("Nhập sô diện thoại");
                        numberPhone = scanner.nextLine();
                        employee.setNumberPhone(numberPhone);
                        employeeRepository.edit(i,employee);
                        System.out.println("Sua Thành công");
                        break;
                    case 6:
                        System.out.println("Nhập email");
                        email = scanner.nextLine();
                        employee.setEmail(email);
                        employeeRepository.edit(i,employee);
                        System.out.println("Sua Thành công");
                        break;
                    case 7:
                        AL:
                        do {
                            System.out.println("Nhập trình độ");
                            System.out.println("1.Trung cấp");
                            System.out.println("2.Cao đẳng");
                            System.out.println("3.Đại học");
                            System.out.println("4.Sau đại học");
                            int choice2;
                            while (true) {
                                try {
                                    choice2 = Integer.parseInt(scanner.nextLine());
                                    if (choice2 > 0 && choice2 <= 4) {
                                        break;
                                    }
                                    System.out.println("Vui lòng nhập trong khoảng 1-4");
                                } catch (NumberFormatException numberFormatException) {
                                    System.out.println("Vui lòng nhập số");
                                } catch (Exception e) {

                                }
                            }
                            switch (choice2) {
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
                        employee.setLerVer(lerVer);
                        employeeRepository.edit(i,employee);
                        System.out.println("Sua thành công");
                        break;
                    case 8:

                        BL:
                        do {
                            System.out.println("nhập ví trí");
                            System.out.println("1.Lễ tân");
                            System.out.println("2.Phục vụ");
                            System.out.println("3.Chuyên viên");
                            System.out.println("4. Giám sát");
                            System.out.println("5. Quản lí");
                            System.out.println("6.Giám đốc");
                            int choice3;
                            while (true) {
                                try {
                                    choice3 = Integer.parseInt(scanner.nextLine());
                                    if (choice3 > 0 && choice3 <= 6) {
                                        break;
                                    }
                                    System.out.println("Vui lòng nhập đúng trong khoảng 1-6");
                                } catch (NumberFormatException numberFormatException) {
                                    System.out.println("Vui lòng nhập số");
                                } catch (Exception e) {

                                }
                            }
                            switch (choice3) {
                                case 1:
                                    location = "Lễ tân";
                                    break BL;
                                case 2:
                                    location = "Phục vụ";
                                    break BL;
                                case 3:
                                    location = "Chuyên vien";
                                    break BL;
                                case 4:
                                    location = "Giám sát";
                                    break BL;
                                case 5:
                                    location = "Quản lí";
                                    break BL;
                                case 6:
                                    location = "Giám đốc";
                                    break BL;
                                default:
                                    System.out.println("Nhập sai nhập lại");
                            }
                        } while (true);
                        employee.setLocation(location);
                        employeeRepository.edit(i,employee);
                        System.out.println("Sửa thành công");
                        break;
                    case 9:

                        System.out.println("Nhập lương");
                        wage = Long.parseLong(scanner.nextLine());
                        employee.setWage(wage);
                        employeeRepository.edit(i,employee);
                        System.out.println("Sua Thành công");
                        break;
                    case 0:
                        employeeRepository.edit(i, employee);
                        System.out.println("Sửa thành công");
                        return;
                    default:
                        System.out.println("Nhap sai nhap lai");
                        break;
                }

            }
        }
    }

}
