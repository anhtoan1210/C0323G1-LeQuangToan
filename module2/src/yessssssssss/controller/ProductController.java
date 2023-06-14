package yessssssssss.controller;

import yessssssssss.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static ProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        do {
            System.out.println("--------------------");
            System.out.println("Mời bạn lựa chọn chức năng");
            System.out.println("1.hiển thị danh sách");
            System.out.println("2.thêm mới sản phẩm");
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
                    productService.deleteProduct();
                    break;
                case 0:
                    System.exit(1);
            }
        } while (true);
    }
}
