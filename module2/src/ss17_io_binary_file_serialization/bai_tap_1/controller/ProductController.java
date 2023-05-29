package ss17_io_binary_file_serialization.bai_tap_1.controller;

import ss17_io_binary_file_serialization.bai_tap_1.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private Scanner scanner = new Scanner(System.in);
    private ProductService productService = new ProductService();

    public void showMenu() {
        boolean flag = true;
        do {
            System.out.println("--------------Quan li san pham-------------\n" +
                    "1.hien thi\n" +
                    "2.them\n" +
                    "3.tim kiem\n" +
                    "4.thoat\n");
            String choice = String.valueOf(Integer.parseInt(scanner.nextLine()));
            switch (choice) {
                case "1":
                    productService.display();
                    break;
                case "2":
                    productService.add();

                    break;
                case "3":
                    productService.search();
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("ban nhap sai moi ban nhap lai");

            }

        } while (flag);
    }
}
