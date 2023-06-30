package castudy.controller;

import castudy.repository.CustomerRepository;
import castudy.service.CustomerService;
import castudy.service.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    private static Scanner scanner = new Scanner(System.in);
    private ICustomerService customerService = new CustomerService();

    public void menuCustomer() {
        do {

            System.out.println("---------------------------------------------");
            System.out.println("-----Mời bạn lựa chọn chức năng-----");
            System.out.println("1. Hiển thị dánh sách Khách hàng");
            System.out.println("2.Thêm mới khách hàng");
            System.out.println("3.Chỉnh sửa khách hàng");
            System.out.println("4. Xoá khách hàng");
            System.out.println("5. Tìm kiếm khách hàng");
            System.out.println("6. Thoát khỏi Menu");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice > 0 && choice <= 6) {
                        break;
                    }
                    System.out.println("Vui lòng nhập trong khoảng Menu của chương trình");
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui lòng nhập số");
                } catch (Exception e) {

                }
            }
            switch (choice) {
                case 1:
                    customerService.displayCustomer();
                    break;
                case 2:
                    customerService.addCustomer();
                    break;
                case 3:
                    customerService.editCustomer();
                    break;
                case 4:
                    customerService.deleteCustomer();
                    break;
                case 5:
                    customerService.searchNameCustomer();
                    break;
                case 6:
                    System.exit(1);
                default:
                    System.out.println("Vui lòng nhập vào các mục có trong");
            }
        } while (true);
    }
}
