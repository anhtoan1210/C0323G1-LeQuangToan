package castudy.controller;

import castudy.service.CustomerService;

import java.util.Scanner;

public class CustomerController {
    Scanner scanner = new Scanner(System.in);
    private CustomerService customerService = new CustomerService();

    public void showMenuCustomer() {
        boolean flag = true;
        do {
            System.out.println("1.Display list customers\n" +
                    "2.Add new customer\n" +
                    "3.Edit customer\n" +
                    "4.delete customer" +
                    "5.Return main menu\n");
            int choice;
            while (true) {

                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("nhập số đi nha");
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
                    flag = false;
                    break;
                default:
                    System.out.println("nhập 1 đến 5 thôi bạn nhé ");

            }
        } while (flag);
    }

}
