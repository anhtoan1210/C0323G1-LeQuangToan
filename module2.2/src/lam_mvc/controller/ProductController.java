package lam_mvc.controller;

import lam_mvc.model.Product;
import lam_mvc.service.IProductService;
import lam_mvc.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static IProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public void menu() {
        do {
            System.out.println("chào mừng bạn ");
            System.out.println("Mời lựa chọn chức năng");
            System.out.println("1.hiển thị");
            System.out.println("2.thêm mới");
            System.out.println("3.xoá");
            System.out.println("4.tìm kiếm");
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
                    productService.search();
                    break;
            }
        } while (true);
    }
}
