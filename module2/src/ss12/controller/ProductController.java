package ss12.controller;

import ss12.service.IProductService;
import ss12.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService productService = new ProductService();

    public void showMenu() {

        do {
            System.out.println("--------quản lí sản phẩm-----------\n" +
                    "1. Thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phẩm theo id\n" +
                    "3.Xoá sản phẩm theo id\n" +
                    "4.Hiển thị danh sách sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm theo tên\n" +
                    "6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n" +
                    "0.Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.add();
                    break;
                case 2:
                    productService.edit();
                    break;
                case 3:
                    productService.remove();
                    break;
                case 4:
                    productService.display();
                    break;
                case 5:
                    productService.search();
                    break;
                case 6:
                    productService.sort();
                    break;
                case 0:
                    System.exit(1);
            }
        } while (true);
    }
}