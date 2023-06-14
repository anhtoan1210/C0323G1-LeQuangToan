package okecomonbaby.controller;

import okecomonbaby.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static ProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        do {
            System.out.println("--------------");
            System.out.println("mời bạn lựa chọn chức năng");
            System.out.println("1.hiển thị");
            System.out.println("2.thêm mới");
            System.out.println("3.xoá");
            System.out.println("4.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.display();
                    break;
                case 2:
                    productService.add();
                    break;
                case 3:
                    productService.delete();
                    break;
                case 4:
                    System.exit(1);
                    break;
            }
        } while (true);
    }
}
