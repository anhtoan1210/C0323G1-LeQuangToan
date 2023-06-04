package castudy.service;

import castudy.model.person.Customer;
import castudy.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void displayCustomer() {
        List<Customer> customerList = customerRepository.getAll();
        for (Customer c : customerList) {
            System.out.println(c);
        }
    }

    @Override
    public void addCustomer() {
        //String id, String name, String dateOfBirth, String gender,
        // String idCode, String phoneNumber, String email, String address, String customerLevel
        System.out.println("nhập id");
        String id = scanner.nextLine();
        System.out.println("nập tên");
        String name = scanner.nextLine();
        System.out.println("nhập năm sinh");
        String dateOfBirth = scanner.nextLine();
        System.out.println("nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập Cmnd");
        String idCode = scanner.nextLine();
        System.out.println("Nhập sô diện thoại");
        String phoneNumber = scanner.nextLine();
        System.out.println("nhập email");
        String email = scanner.nextLine();
        System.out.println(" Địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập cấp độ khách hàng");
        String customerLevel = scanner.nextLine();
        Customer customer = new Customer(id, name, dateOfBirth, gender, idCode, phoneNumber, email, address, customerLevel);
        customerRepository.addCustomer(customer);
        System.out.println("thêm thành công");
    }

    @Override
    public void editCustomer() {
        System.out.println("nhập id nhân viên m bạn muốn sửa");
        String id = scanner.nextLine();
        List<Customer> customerList = customerRepository.getAll();
        for (int i = 0; i < customerList.size(); i++) {
            if (id.equals(customerList.get(i).getId())) {
                System.out.println("nập tên");
                String name = scanner.nextLine();
                System.out.println("nhập năm sinh");
                String dateOfBirth = scanner.nextLine();
                System.out.println("nhập giới tính");
                String gender = scanner.nextLine();
                System.out.println("Nhập Cmnd");
                String idCode = scanner.nextLine();
                System.out.println("Nhập sô diện thoại");
                String phoneNumber = scanner.nextLine();
                System.out.println("nhập email");
                String email = scanner.nextLine();
                System.out.println(" Địa chỉ");
                String address = scanner.nextLine();
                System.out.println("nhập cấp độ khách hàng");
                String customerLevel = scanner.nextLine();
                Customer customer = new Customer(id, name, dateOfBirth, gender, idCode, phoneNumber, email, address, customerLevel);
                customerRepository.editCustomer(i, customer);
            }

        }
    }

    @Override
    public void deleteCustomer() {
        List<Customer> customerList = customerRepository.getAll();
        System.out.println("nhập ì mà bạn muốn xoá");
        String id = scanner.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (id.equals(customerList.get(i).getId())) {
                customerRepository.removeCustomer(i);
                System.out.println("xoá oke");
            }

        }
    }
}
