package castudy.controller;

import castudy.service.EmployeeService;

import java.util.Scanner;

public class FuramaController {
    private static EmployeeController employeeController = new EmployeeController();
    private static CustomerController customerController = new CustomerController();
    private static FacilityController facilityController = new FacilityController();
    private static BookingCotroller bookingCotroller = new BookingCotroller();
    private static PromotionController promotionController = new PromotionController();
    private static EmployeeService employeeService = new EmployeeService();

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1.Employee Management\n" +
                    "2.Customer Management\n" +
                    "3.Facility Management\n" +
                    "4.Booking Management\n" +
                    "5.Promotion Management\n" +
                    "6.Exit\n ");
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
                    employeeController.showMenuEmployeeM();
                    break;
                case 2:
                    customerController.showMenuCustomer();
                    break;
                case 3:
                    facilityController.showMenuFacility();
                    break;
                case 4:
                    bookingCotroller.showMenuBooking();
                    break;
                case 5:
                    promotionController.showMenuPromotion();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("vui lòng nhập tu 1 đến 6");
            }

        } while (flag);
    }
}
