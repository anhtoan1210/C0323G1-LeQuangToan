package ss10_list.controller;

import ss10_list.service.FruitService;

import java.util.Scanner;

public class FruitController {
    private static FruitService fruitService = new FruitService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        do {
            System.out.println("---------------------");
            System.out.println("Mời bạn lựa chọn chức năng");
            System.out.println("1.Hiển thi");
            System.out.println("2.Thêm");
            System.out.println("0.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    fruitService.display();
                    break;
                case 2:
                    fruitService.add();
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Bạn hãy chọn những chức năng có trong module");
            }
        } while (true);
    }
}
