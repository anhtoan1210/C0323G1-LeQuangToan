package castudy.controller;

import java.util.Scanner;

public class BookingController {
    private static Scanner scanner = new Scanner(System.in);

    public void menuBooking() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("------Mời bạn lựa chọn chức năng-----");
        System.out.println("1. Thêm đặt phòng mới");
        System.out.println("2.Hiển thị danh sách đặt phòng");
        System.out.println("3.Tạo hợp đồng mới");
        System.out.println("4.Hiển thị danh sách hợp đồng");
        System.out.println("5.Chỉnh sửa hợp đồng");
        System.out.println("6.Thoát khỏi Menu");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice <= 6 && choice > 0) {
                    break;
                }
                System.out.println("Vui lòng nhập đúng so");
            } catch (NumberFormatException numberFormatException) {
                System.out.println("vui lòng nhập số");
            }catch (Exception e){

            }
        }
        switch (choice) {
            case 1:
                System.out.println("coming soon");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.exit(1);
            default:
                System.out.println("Vui lòng nhập các mục có trong chương trình");
        }
    }
}
