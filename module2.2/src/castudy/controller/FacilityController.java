package castudy.controller;

import castudy.model.facility.Facility;

import java.util.Scanner;

public class FacilityController {
    private static Scanner scanner = new Scanner(System.in);

    public void menuFacility() {
        do {
            System.out.println("-------------------");
            System.out.println("--------Chào mừng bạn--------");
            System.out.println("---------Mời bạn lựa cho chức năng-------");
            //1	Display list facility
            //2	Add new facility
            //3	Display list facility maintenance
            //4	Delete facility
            //5	Return main menu
            System.out.println("1.Hiển thị danh sách cơ sở");
            System.out.println("2.Thêm mới cơ sở");
            System.out.println("3.Hiển thị danh sách bảo trì");
            System.out.println("4.Xoá cở sở");
            System.out.println("5.Thoát khỏi menu");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice > 0 && choice <= 5) {
                        break;
                    }
                    System.out.println("Vui lòng nhập các mục có trong Menu");
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Vui long nhập số");
                } catch (Exception e) {

                }
            }
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(1);
                default:
                    System.out.println("Vui lòng nhập các mục có trong Menu");
            }
        } while (true);
    }
}
