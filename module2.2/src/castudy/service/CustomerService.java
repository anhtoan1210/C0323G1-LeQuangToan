package castudy.service;

import castudy.model.peson.Customer;
import castudy.repository.CustomerRepository;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static final Scanner scanner = new Scanner(System.in);
    private CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void displayCustomer() {
        List<Customer> customers = customerRepository.getAll();
        for (Customer c : customers) {
            System.out.println(c);
        }

    }

    @Override
    public void addCustomer() {
        System.out.println("Nhập mã khách hàng muốn thêm");
        String id = scanner.nextLine();
        System.out.println("Nhập tên khách hàng");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String dateOfBirth = scanner.nextLine();
        String gender;
        AD:
        do {
            System.out.println("Chọn giới tính");
            System.out.println("1.Nam");
            System.out.println("2.Nữ");
            System.out.println("3.Khác");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice > 0 && choice <= 3) {
                        break;
                    }
                    System.out.println("Vui lòng nhập đúng trong Menu");
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòn nhập số");
                } catch (Exception e) {

                }
            }
            switch (choice) {
                case 1:
                    gender = "Nam";
                    break AD;
                case 2:
                    gender = "Nữ";
                    break AD;
                case 3:
                    gender = "Khác";
                    break AD;
                default:
                    System.out.println("Nhập sai nhập lại");
                    break;
            }
        } while (true);
        System.out.println("Nhập chứng minh nhân dân");
        String idCode = scanner.nextLine();
        System.out.println("Nhập số điện thoại");
        String numberPhone = scanner.nextLine();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        String customerLevel;
        AC:
        do {
            System.out.println("Chọn cấp độ khách hàng");
            System.out.println("1.(Diamond");
            System.out.println("2.Platinum");
            System.out.println("3.Gold");
            System.out.println("4.Silver");
            System.out.println("5.Member");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice > 0 && choice <= 5) {
                        break;
                    }
                    System.out.println("Vui lòng nhập các muc có trong Menu");
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("VUi lòng nhập số");
                } catch (Exception e) {

                }
            }
            switch (choice) {
                case 1:
                    customerLevel = "Diamond";
                    break AC;
                case 2:
                    customerLevel = "Platinum";
                    break AC;
                case 3:
                    customerLevel = "Gold";
                    break AC;
                case 4:
                    customerLevel = "Silver";
                    break AC;
                case 5:
                    customerLevel = "Member";
                    break AC;
                default:
                    System.out.println("Vui lòng nhập đúng");
                    break;
            }

        } while (true);
        Customer customer = new Customer(id, name, dateOfBirth, gender, idCode, numberPhone, email, address, customerLevel);
        customerRepository.add(customer);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void deleteCustomer() {
        System.out.println("Nhập id khách hàng mà bạn muốn xoá");
        String id = scanner.nextLine();
        Customer customer = customerRepository.getByID(id);
        if (customer == null) {
            System.out.println("không tìm thấy khách hàng cần xoá");
        } else {
            System.out.println("Bạn có chắc chắn muốn xoá");
            System.out.println("1.Có");
            System.out.println("2.Không");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                customerRepository.delete(customer);
                System.out.println("Xoá thành công");
            }
        }
    }

    @Override
    public void editCustomer() {
        System.out.println("Nhập id mà bạn muốn sửa");
        String id = scanner.nextLine();
        List<Customer> customers = customerRepository.getAll();
        for (int i = 0; i < customers.size(); i++) {
            if (id.equals(customers.get(i).getId())) {
//String id, String name, String dateOfBirth, String gender, String idCode,
// String numberPhone, String email, String address, String customerLevel) {
                System.out.println("Nhập tên");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sinh");
                String dateOfBirth = scanner.nextLine();
                String gender;
                AD:
                do {
                    System.out.println("Chọn giới tính");
                    System.out.println("1.Nam");
                    System.out.println("2.Nữ");
                    System.out.println("3.Khác");
                    int choice;
                    while (true) {
                        try {
                            choice = Integer.parseInt(scanner.nextLine());
                            if (choice > 0 && choice <= 3) {
                                break;
                            }
                            System.out.println("Vui lòng nhập đúng trong Menu");
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Vui lòn nhập số");
                        } catch (Exception e) {

                        }
                    }
                    switch (choice) {
                        case 1:
                            gender = "Nam";
                            break AD;
                        case 2:
                            gender = "Nữ";
                            break AD;
                        case 3:
                            gender = "Khác";
                            break AD;
                        default:
                            System.out.println("Nhập sai nhập lại");
                            break;
                    }
                } while (true);
                System.out.println("Nhập chứng minh nhân dân");
                String idCode = scanner.nextLine();
                System.out.println("Nhập số điện thoại");
                String numberPhone = scanner.nextLine();
                System.out.println("Nhập email");
                String email = scanner.nextLine();
                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();

                String customerLevel;
                AC:
                do {
                    System.out.println("Chọn cấp độ khách hàng");
                    System.out.println("1.(Diamond");
                    System.out.println("2.Platinum");
                    System.out.println("3.Gold");
                    System.out.println("4.Silver");
                    System.out.println("5.Member");
                    int choice;
                    while (true) {
                        try {
                            choice = Integer.parseInt(scanner.nextLine());
                            if (choice > 0 && choice <= 5) {
                                break;
                            }
                            System.out.println("Vui lòng nhập các muc có trong Menu");
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("VUi lòng nhập số");
                        } catch (Exception e) {

                        }
                    }
                    switch (choice) {
                        case 1:
                            customerLevel = "Diamond";
                            break AC;
                        case 2:
                            customerLevel = "Platinum";
                            break AC;
                        case 3:
                            customerLevel = "Gold";
                            break AC;
                        case 4:
                            customerLevel = "Silver";
                            break AC;
                        case 5:
                            customerLevel = "Member";
                            break AC;
                        default:
                            System.out.println("Vui lòng nhập đúng");
                            break;
                    }

                } while (true);

                Customer customer = new Customer(id, name, dateOfBirth, gender, idCode, numberPhone, email, address, customerLevel);
                customerRepository.edit(i, customer);
                System.out.println("Sửa thành công");
            }
        }
    }

    @Override
    public void searchNameCustomer() {
        System.out.println("Nhập tên cần tìm kiếm");
        String name = scanner.nextLine();
        List<Customer> customerList = customerRepository.search(name);
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
        if (customerList.isEmpty()) {
            System.out.println(" Không tìm thấy ");
        }
    }
}
