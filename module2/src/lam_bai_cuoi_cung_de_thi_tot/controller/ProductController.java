package lam_bai_cuoi_cung_de_thi_tot.controller;

import lam_bai_cuoi_cung_de_thi_tot.model.Product;
import lam_bai_cuoi_cung_de_thi_tot.service.IProductService;
import lam_bai_cuoi_cung_de_thi_tot.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static IProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        do {
            System.out.println("--------------------------");
            System.out.println("Moi anh sơi");
            System.out.println("1. hiển thị sản phẩm");
            System.out.println("2.thêm mới sản phẩm");
            System.out.println("3.xoá sản phẩm");
            System.out.println("4.tìm kiếm sản phẩm");
            System.out.println("0.thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productService.displayAll();
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
                case 0:
                    System.exit(1);
                default:
                    System.out.println("mời chọn đúng chức năng đang có");
            }

        } while (true);
    }
}
