package lam_di_lam_lai.controller;

import lam_di_lam_lai.model.Product;
import lam_di_lam_lai.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static ProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        do {
            System.out.println("---------------------");
            System.out.println("mời bạn lựa chọn chức năng");
            System.out.println("1. Hiển thị danh sách sản phẩm");
            System.out.println("2.Thêm mới sản phẩm");
            System.out.println("3.Xoá sản phẩm");
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
                    break;
            }
        } while (true);
    }

}
