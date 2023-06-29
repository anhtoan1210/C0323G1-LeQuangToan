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
        //String id, String name, String dateOfBirth, String gender,
        // String idCode, String numberPhone, String email, String address, String customerLevel)
        System.out.println("Nhập mã khách hàng muốn thêm");
        String id = scanner.nextLine();
        System.out.println("Nhập tên khách hàng");
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
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập cấp độ khách hàng");
        String customerLevel = scanner.nextLine();
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
            if (choice==1){
                customerRepository.delete(customer);
                System.out.println("Xoá thành công");
            }
        }
    }

    @Override
    public void editCustomer() {

    }

    @Override
    public void searchNameCustomer() {
        System.out.println("Nhập tên cần tìm kiếm");
        String name = scanner.nextLine();
        List<Customer> customerList = customerRepository.search(name);
        for (Customer customer :customerList) {
            System.out.println(customer);
        }
        if(customerList.isEmpty()){
            System.out.println("Không tìm thấy ");
        }
    }
}
