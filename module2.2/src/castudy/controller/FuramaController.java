package castudy.controller;

import castudy.model.facility.Facility;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    private BookingController bookingController = new BookingController();
    private CustomerController customerController = new CustomerController();
    private EmployeeController employeeController = new EmployeeController();
    private PromotionController promotionController = new PromotionController();
    private FacilityController facilityController = new FacilityController();

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("----- Mời bạn lựa chọn chức năng -----");
        System.out.println("1.Employee Management");
        System.out.println("2.Customer Management");
        System.out.println("3.Facility Management ");
        System.out.println("4.Booking Management");
        System.out.println("5.Promotion Management");
        System.out.println("6.Thoát khỏi Menu");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                employeeController.menuEmployee();
                break;
            case 2:
                customerController.menuCustomer();
                break;
            case 3:
                facilityController.menuFacility();
                break;
            case 4:
                bookingController.menuBooking();

                break;
            case 5:
                promotionController.menuPromotion();

                break;
            case 6:
                System.exit(1);
        }
    }
}
