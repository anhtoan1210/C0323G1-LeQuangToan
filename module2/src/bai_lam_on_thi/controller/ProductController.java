package bai_lam_on_thi.controller;

import bai_lam_on_thi.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static ProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        do {
            System.out.println("Chào mừng đến tạp hoá nhà tôi");
            System.out.println("mơi bạn lựa chọn chức năng");
            System.out.println("1.hiển thị sản phẩm");
            System.out.println("2.thêm sản phẩm");
            System.out.println("3.xoá san phẩm");
            System.out.println("0.thoát");
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
                case 0:
                    System.exit(1);

            }
        } while (true);
    }
}
