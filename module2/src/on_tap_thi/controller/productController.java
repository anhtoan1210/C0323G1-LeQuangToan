package on_tap_thi.controller;

import on_tap_thi.service.ProductService;

import java.util.Scanner;

public class productController {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService productService = new ProductService();

    public static void menu() {
        do {
            System.out.println("-------------------");
            System.out.println("Lựa chọn chức năng");
            System.out.println("1. hiển thị danh sách sản phẩm");
            System.out.println("2.Thêm mới sản phẩm");
            System.out.println("3.Xoá sản phẩm");
            System.out.println("0.Thoat");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.displayAll();
                    break;
                case 2:
                    productService.addProduct();
                    break;
                case 3:
                    productService.deleteProduct();
                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã mua hàng");
                    System.exit(1);
            }

        } while (true);
    }
}
