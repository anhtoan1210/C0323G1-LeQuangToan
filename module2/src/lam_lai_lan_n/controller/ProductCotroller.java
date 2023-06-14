package lam_lai_lan_n.controller;

import lam_lai_lan_n.service.ProductService;

import java.util.Scanner;

public class ProductCotroller {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService productService = new ProductService();

    public static void menu() {
        do {
            System.out.println("------------------");
            System.out.println("Nhập vào lựa chọn chức năng của bạn");
            System.out.println("1.Hiển thị sản phẩm");
            System.out.println("2.Thêm sản phẩm");
            System.out.println("3.Xoá sản phẩm");
            System.out.println("0.thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.display();
                    break;
                case 2:
                    productService.addProduct();
                    break;
                case 3:
                    productService.removeProduct();
                    break;
                case 4:
                    System.exit(1);
                    break;
            }
        } while (true);
    }

}
