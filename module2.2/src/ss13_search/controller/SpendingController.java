package ss13_search.controller;

import ss13_search.service.SpendingService;

import java.util.Scanner;

public class SpendingController {
    private static SpendingService spendingService = new SpendingService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        do {
            System.out.println("-------------------");
            System.out.println("Mời bạn lựa chọn chức năng");
            System.out.println("1.Hiển thị");
            System.out.println("2.Thêm");
            System.out.println("3.Xoá");
            System.out.println("4.Sửa");
            System.out.println("5.Tìm kiếm gần đúng theo tên chi tiêu");
            System.out.println("6.Tìm kiếm theo mã");
            System.out.println("7.Sắp xếp theo tên");
            System.out.println("0. thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    spendingService.display();
                    break;
                case 2:
                    spendingService.add();
                    break;
                case 3:
                    spendingService.delete();
                    break;
                case 4:
                    spendingService.edit();
                    break;
                case 5:
                    spendingService.search();
                    break;
                case 6:
                    spendingService.searchId();
                case 7:
                    spendingService.sortName();
                    break;
                case 0:
                    System.exit(1);

            }
        } while (true);
    }
}
