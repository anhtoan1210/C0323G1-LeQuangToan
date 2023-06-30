package castudy.controller;

import java.util.Scanner;

public class PromotionController {
    private static Scanner scanner = new Scanner(System.in);

    public void menuPromotion() {
        System.out.println("-----------");
        System.out.println(" Mời bạn lựa chọn chức năng");
        System.out.println("1. Hiển thị danh sách khách hàng sử dụng dịch vụ");
        System.out.println("2. Hiển thị danh sách khách hàng nhận voucher");
        System.out.println("3.Thoát");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice <= 3 && choice > 0) {
                    break;
                }
                System.out.println("Vui lòng nhập trong khoảng Menu");
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Vui lòng nhập so");
            } catch (Exception e) {

            }
        }
        switch (choice) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                System.exit(1);

        }
    }
}
